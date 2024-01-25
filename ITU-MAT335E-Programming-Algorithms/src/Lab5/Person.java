package mat335Labs.Lab5;

public class Person {
	
	private String name;
	private String tcNo;
	private Aquarium aquarium;
	private Cat cat;
	
	public Person(String name, String tcNo) {
		this.name = name;
		this.tcNo = tcNo;
	}
	
	public void introduceYourself() {
	
		System.out.println("-------------------------------------------------");
		
		System.out.println("My name is " + this.name);
		System.out.println("My TC No is " + this.tcNo);
		
		if(getCat() != null) {
			System.out.println("I have a cat named " + cat.getName() );
		}
		else{
			System.out.println("I have no cat.");
		}
		
		if(getAquarium() != null) {
			System.out.println("I have an aquarium with " + aquarium.getNumberFish() + " fish in it");
		}
		else{
			System.out.println("I have no aquarium.");
		}
		System.out.println("-------------------------------------------------");
	}
	
	public String getName() {
		return name;
	}
	
	public String getTcNo() {
		return tcNo;
	}

	public Aquarium getAquarium() {
		return aquarium;
	}

	public void setAquarium(Aquarium aquarium) {
		this.aquarium = aquarium;
	}

	public Cat getCat() {
		return cat;
	}

	public void setCat(Cat cat) {
		this.cat = cat;
	}
	
}
