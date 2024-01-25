package Lab7;

public class DrivingSchool {
	private String name;
	private double price;
	
	public DrivingSchool(String name, double price) {
		this.setName(name);
		this.setPrice(price);
	}
	
	public boolean Register(int age) {
		if (age<18) {
			throw new IllegalArgumentException("Person cannot be under age of 18.");
		}
		
		return true;

	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price < 0) {
			throw new IllegalArgumentException("Price cannot be negative.");
		}
		this.price = price;
	}
	
	

}
