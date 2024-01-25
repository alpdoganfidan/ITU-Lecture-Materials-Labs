package Lab7;

public class Movie {
	private String title, barcode;
	private MovieType type;
	
	public Movie(String title, String barcode, MovieType type) {
		this.title = title;
		this.barcode = barcode;
		this.type = type;
	}
	
	public double getDailyPrice(double exchangeRate) {
		double rentalPrice = type.getRentalPrice();
		return rentalPrice*exchangeRate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public MovieType getType() {
		return type;
	}

	public void setType(MovieType type) {
		this.type = type;
	}
	
}
