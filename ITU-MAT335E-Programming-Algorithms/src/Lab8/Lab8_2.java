package Lab8;

public class Lab8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person myPerson = new Person("Alp");
		Car myCar1 = new Car("TRY 1");
		Car myCar2 = new Car("TRY 2");
		Car myCar3 = new Car("TRY 3");
		Car myCar4 = new Car("TRY 4");
		
		Gallery myGallery = new Gallery("OtoGaleri1",3,myPerson);
		
		System.out.println(myPerson.getName());
		System.out.println(myCar1.introduceSelf());
		System.out.println(myGallery.introduceSelf());
		
		System.out.println("1. araba ekleniyor :"+myGallery.addCar(myCar1));
		System.out.println("2. araba ekleniyor :"+myGallery.addCar(myCar2));
		System.out.println("3. araba ekleniyor :"+myGallery.addCar(myCar3));
		System.out.println("4. araba ekleniyor :"+myGallery.addCar(myCar4));
		
		System.out.println(myGallery.introduceSelf());
		
		System.out.println("2. araba sorgulanıyor : "+myGallery.searchCar(myCar2));
		System.out.println("4. araba sorgulanıyor : "+myGallery.searchCar(myCar4));
		
	}

}
