// Name, Surname: Alp Doğan Fidan
// Student ID: 090180320
// Question no: 2

package Question2;

public class CarBooking {
    private String plateNumber;
    private double dailyRate;
    private final String dateHired;
    private String dateDue;
    private String dateReturned;

    public CarBooking(String plateNumber, double dailyRate, String dateHired, String dateDue, String dateReturned) {
        this.plateNumber = plateNumber;
        this.dailyRate = dailyRate;
        this.dateHired = dateHired;
        this.dateDue = dateDue;
        this.dateReturned = dateReturned;
    }

    public double calculateCharge() {
    	// expectedNumberOfDays is 7
    	long expectedNumberOfDays = DatesCalculation.noOfDays(dateHired, dateDue);
    	long totalHiredNumberOfDays = DatesCalculation.noOfDays(dateHired, dateReturned);
        long overdueNumberOfDays = DatesCalculation.noOfDays(dateDue, dateReturned);
        
        
        double currentDailyRate = this.dailyRate;
        
        double charge;
        
        // if totalHiredNumberOfDays is less than equal to 7
        if (totalHiredNumberOfDays <= expectedNumberOfDays) {
        	charge = dailyRate*totalHiredNumberOfDays;
        	System.out.println("1: "+charge);
        }
        else {
        	charge = dailyRate*expectedNumberOfDays;
        	while (overdueNumberOfDays >0) {
        		System.out.println("2: "+charge);
        		currentDailyRate += currentDailyRate;
        		charge += currentDailyRate;
        		--overdueNumberOfDays;
        		System.out.println("3: "+charge);
        	}
        }
        
        return charge;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public String getDateHired() {
        return dateHired;
    }

    public String getDateDue() {
        return dateDue;
    }

    public String getDateReturned() {
        return dateReturned;
    }
}
