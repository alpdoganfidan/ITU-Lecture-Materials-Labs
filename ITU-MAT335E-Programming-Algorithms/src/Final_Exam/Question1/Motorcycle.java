// Name, Surname: Alp Doğan Fidan
// Student ID: 090180320
// Question no: 1

package Question1;

public class Motorcycle extends Vehicle{

	public Motorcycle(String plateNumber, double fuelAmount, double tankCapacity, double gallonPerMiles) {
		super(plateNumber, fuelAmount, tankCapacity, gallonPerMiles);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean drive(double miles) {
		// TODO Auto-generated method stub
		double totalGallons = miles*getGallonPerMiles();
		
		if (getFuelAmount()<totalGallons) {
			System.out.println("Insufficient fuel amount.");
			return false;
		}
		
		setFuelAmount(getFuelAmount()-totalGallons);
		
		 if (getFuelAmount() < (10/100)*getTankCapacity()) {
	         fillFuel();
		 }else {
	         System.out.println("Fill amount is sufficient.");
	     }
		
		return true;
	}
	

}
