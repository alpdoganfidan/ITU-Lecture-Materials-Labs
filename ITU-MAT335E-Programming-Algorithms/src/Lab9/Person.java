package Lab9;

public class Person {
	private final String firstName;
	private String lastName;
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void buyCigarette() {System.out.println("You cant buy any cigarette.");}
	public void buyCandy() {		System.out.println("You can buy candy.");
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
