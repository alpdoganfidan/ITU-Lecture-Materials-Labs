package Lab9;

public class Kid extends Person{
	
	public Kid(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	public void buyCigarette() {
		System.out.println("You cant buy any cigarette.");
	}
	public void buyCandy() {
		System.out.println("You can buy candy.");
	}
}
