package Lab9;

public class YoungAdult extends Person{

	public YoungAdult(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	public void buyCigarette() {
		System.out.println("You can buy cigarette, but you must stop smoking.");
	}
	
	public void buyCandy() {
		System.out.println("You can buy candy.");
	}
}
