package Lab7;

import java.time.LocalDate;

public class TestRental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		LocalDate beforeDate = LocalDate.of(2014, 4, 12);
	    LocalDate afterDate = LocalDate.of(2014,4,16);
	    
	   
	    Movie mv = new Movie("Beyond","BC3315",MovieType.NEW_RELEASE);
	    
	    try {
	    	Rental rt1 = new Rental(mv,beforeDate,afterDate);
	    	double exchangeRate = 20;
	    	
	    	System.out.println("RentalDate : "+rt1.getRentalDate());
	    	System.out.println("DueDate : "+rt1.getDueDate());
		    System.out.println("Barcode : "+rt1.getMovie().getBarcode());
		    System.out.println("Title : "+rt1.getMovie().getTitle());
		    System.out.println("RentalPrice : "+rt1.getMovie().getType().getRentalPrice());
		    System.out.println("DailyPrice : "+rt1.getMovie().getDailyPrice(exchangeRate));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("An error occured : "+e.getMessage());
		}
	    
	    
	    
	}
}