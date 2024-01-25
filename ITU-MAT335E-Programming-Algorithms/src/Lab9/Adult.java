package Lab9;

public class Adult extends Person{

	public Adult(String firstName, String lastName) {
		super(firstName, lastName);
		// TODO Auto-generated constructor stub
	}

	public void buyCigarette() {
		System.out.println("You can buy cigarette.");
	}
	
	public void buyCandy() {
		System.out.println("You can buy candy, but you must be careful about getting fat.");
	}
}

