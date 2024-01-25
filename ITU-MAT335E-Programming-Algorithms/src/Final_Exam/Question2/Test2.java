package Question2;


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

        CarBooking carBooking = new CarBooking("34 ALP 51", 55.0, "2023-06-09", "2023-06-16", "2023-06-20");

        // Rezervasyon ücretini hesaplama
        double charge = carBooking.calculateCharge();

        System.out.println("Plate Number: " + carBooking.getPlateNumber());
        System.out.println("Daily Rate: " + carBooking.getDailyRate());
        System.out.println("Date Hired: " + carBooking.getDateHired());
        System.out.println("Date Due: " + carBooking.getDateDue());
        System.out.println("Date Returned: " + carBooking.getDateReturned());
        System.out.println("Total Charge: " + charge);
	}

}
