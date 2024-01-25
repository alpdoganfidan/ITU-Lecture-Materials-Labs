package Lab8;

public class Person {
	private String name;
	private Gallery gallery;
	private Car car;
	
	public Person (String name) {
		this.name = name;
	}
	
	public String introduceSelf() {
		String str = "My name is : " + getName();
		
		if (getGallery() != null) {
			str += "\nMy Gallery is : "+ getGallery().getGalleryName();
		}
		
		if (getCar() != null) {
			str += "\nMy Car is : "+ getCar().getPlate();
		}
		
		return str;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Gallery getGallery() {
		return gallery;
	}

	public void setGallery(Gallery gallery) {
		this.gallery = gallery;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
}
