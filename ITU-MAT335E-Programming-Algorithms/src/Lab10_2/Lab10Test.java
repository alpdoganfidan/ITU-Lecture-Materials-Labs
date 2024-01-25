package Lab10_2;

public class Lab10Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int modelYear = 2000;
		double engineVolume = 5;
		double tonnage = 5;
		
		double baseTax = 10;
		int currentYear = 2005;
		
		Car car = new Car(modelYear, engineVolume);
		Bus bus = new Bus(modelYear, tonnage);
		
		System.out.println("Car tax = "+car.calculateTax(baseTax));
		System.out.println("Car amortized tax = "+car.calculateAmortizedTax(baseTax, currentYear));
		
		
		System.out.println("Bus amortized tax = "+bus.calculateAmortizedTax(baseTax, currentYear));
		;
	}

}
