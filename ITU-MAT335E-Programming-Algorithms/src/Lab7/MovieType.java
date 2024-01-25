package Lab7;

public enum MovieType {
	
	REGULAR(1.5),
	NEW_RELEASE(2.0),
	CHILDREN(1.0);
	
	private double rentalPrice;
	
	MovieType(double rentalPrice) {

		this.rentalPrice =rentalPrice;
	}

	public double getRentalPrice() {
		return rentalPrice;
	}
	
	
}
