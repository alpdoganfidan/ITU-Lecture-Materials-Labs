package Question1;

public abstract class Vehicle {
	private final String plateNumber;
	private double fuelAmount;
	private double tankCapacity;
	private double gallonPerMiles;
	
	public Vehicle(String plateNumber, double fuelAmount, double tankCapacity, double gallonPerMiles) {
		this.plateNumber=plateNumber;
		this.fuelAmount=fuelAmount;
		this.tankCapacity=tankCapacity;
		this.gallonPerMiles=gallonPerMiles;
	}

	public abstract boolean drive(double miles);

	public void fillFuel() {
		setFuelAmount(tankCapacity);
		System.out.println("Vehicle is filled.");
	         
	}
	
	public double getFuelAmount() {
		return fuelAmount;
	}

	public void setFuelAmount(double fuelAmount) {
		this.fuelAmount = fuelAmount;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public double getTankCapacity() {
		return tankCapacity;
	}

	public void setTankCapacity(double tankCapacity) {
		this.tankCapacity = tankCapacity;
	}

	public double getGallonPerMiles() {
		return gallonPerMiles;
	}

	public void setGallonPerMiles(double gallonPerMiles) {
		this.gallonPerMiles = gallonPerMiles;
	}
}
