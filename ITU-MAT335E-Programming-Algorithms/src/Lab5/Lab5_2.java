package mat335Labs.Lab5;

public class Lab5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String personName = "Alp";
		String personTcNo = "375";
		String catName = "Duman";
		int countFish = 10;
		
		
		Person person1 = new Person(personName,personTcNo);
		Cat cat1 = new Cat(catName);
		Aquarium aquarium1 = new Aquarium(countFish);

		
		System.out.println("---------------- 1st Stage ----------------");
		
		person1.introduceYourself();
		
		System.out.println("---------------- 2nd Stage ----------------");
		
		person1.setAquarium(aquarium1);
		person1.setCat(cat1);
		
		person1.introduceYourself();
		
		System.out.println("---------------- 3rd Stage ----------------");
		
		person1.getAquarium().addFish();
		person1.introduceYourself();
		
		System.out.println("---------------- 4th Stage ----------------");
		
		person1.getAquarium().removeFish(12);
		person1.getAquarium().addFish();
		person1.introduceYourself();
		
	}

}
