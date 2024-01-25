package Lab9;

public class Lab9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid kid = new Kid("Çocuk","Can");
		YoungAdult youngAdult = new YoungAdult("Baba","Can");
		Adult adult = new Adult("Dede","Can");
		
		System.out.println(kid.getFirstName()+":");
		kid.buyCandy();
		kid.buyCigarette();
		
		System.out.println(youngAdult.getFirstName()+":");
		youngAdult.buyCandy();
		youngAdult.buyCigarette();

		System.out.println(adult.getFirstName()+":");
		adult.buyCandy();
		adult.buyCigarette();
	}

}
