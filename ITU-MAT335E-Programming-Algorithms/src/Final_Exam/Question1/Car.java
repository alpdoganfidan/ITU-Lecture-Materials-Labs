// Name, Surname: Alp Doğan Fidan
// Student ID: 090180320
// Question no: 1

package Question1;

import java.time.Year;
import java.util.ArrayList;

public class Car extends Vehicle{
	private ArrayList<Double> totalMilesPerYear;
	private int modelYear;

	public Car(String plateNumber, double fuelAmount, double tankCapacity, double gallonPerMiles,
			ArrayList<Double> totalMilesPerYear,
			int modelYear) {
		super(plateNumber, fuelAmount, tankCapacity, gallonPerMiles);
		// TODO Auto-generated constructor stub
		this.modelYear = modelYear;
		this.totalMilesPerYear = new ArrayList<Double>();
		
		int currentYear = Year.now().getValue();
		for (int i = 0; i<(currentYear-modelYear); i++) {
			this.totalMilesPerYear.add( (double)0);
		}
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
		
		// There is no year info ? When this function is executed, it makes an addition for a new year.
		int currentYear = Year.now().getValue();
		totalMilesPerYear.set(currentYear-modelYear, totalMilesPerYear.get(currentYear-modelYear)+miles);
		 if (getFuelAmount() < (20/100)*getTankCapacity()) {
	         fillFuel();
		 }else {
	         System.out.println("Fill amount is sufficient.");
	     }
		
		return true;
	}
	
	public double fuelConsumptionAmount(int year) {
		
		int index = modelYear-year; 
		
		return totalMilesPerYear.get(index);
	}
	
	public ArrayList<Double> getTotalMilesPerYear() {
        return totalMilesPerYear;
    }
	
	public void setTotalMilesPerYear(ArrayList<Double> totalMilesPerYear) {
        this.totalMilesPerYear = totalMilesPerYear;
    }
	
}
