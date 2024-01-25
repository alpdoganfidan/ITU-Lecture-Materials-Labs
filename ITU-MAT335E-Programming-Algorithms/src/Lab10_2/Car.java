package Lab10_2;

public class Car implements CommercialVehicle, PersonalVehicle{
	private int modelYear;
	private double engineVolume;
	
    public Car(int modelYear, double engineVolume) {
    	this.modelYear = modelYear;
        this.engineVolume = engineVolume;
    }
	
	@Override
	public double calculateTax(double baseTax) {
		// TODO Auto-generated method stub
		return engineVolume * baseTax;
	}
	@Override
	public double calculateAmortizedTax(double baseTax, int currentYear) {
		// TODO Auto-generated method stub

		 int carAge = currentYear - modelYear;
		 double amortizationRate = 1.0;
		 
		 if (carAge<10) {
			 for(int year = 0; year<carAge;year++) {
				amortizationRate *= 0.9;
			 }
		 }else {
			 amortizationRate = 0.1;
		 }
		 
		 return baseTax*amortizationRate;

	}
	public int getModelYear() {
		return modelYear;
	}
	public double getEngineVolume() {
		return engineVolume;
	}
	
}
