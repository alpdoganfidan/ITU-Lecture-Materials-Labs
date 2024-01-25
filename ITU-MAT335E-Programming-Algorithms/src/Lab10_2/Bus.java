package Lab10_2;

public class Bus implements CommercialVehicle{
	
	private int modelYear;
	private double tonnage;
	
    public Bus(int modelYear, double tonnage) {
    	this.modelYear = modelYear;
        this.tonnage = tonnage;
    }

	@Override
	public double calculateAmortizedTax(double baseTax, int currentYear) {
		// TODO Auto-generated method stub
		double tonnageRate = ((tonnage<1) ? 1.0 : ((tonnage<10) ? 1.4 : 1.6));
		
		double ageCoefficient = 0.05;
		double ageRate = ageCoefficient*(currentYear-modelYear);
		if (ageRate>2) {
			ageRate = 2;
		}
		System.out.printf("TonnageRate = %.2f , AgeRate = %.2f \n",tonnageRate,ageRate);
		return baseTax*tonnageRate*ageRate;
	}

	public double getTonnage() {
		return tonnage;
	}

	public int getModelYear() {
		return modelYear;
	}

}
