package Lab8;

public class Car {
	private String plate;
	private Person person;
	private Gallery gallery;
	
	public Car(String plate) {
		this.setPlate(plate);
	}
	
	public String introduceSelf() {
		String str = "Car Plate : "+getPlate();
		
		if(getPerson() != null) {
			str += "\nPerson : "+getPerson().getName();
		}
		
		if(getGallery() != null) {
			str += "\nGallery : "+getGallery().getGalleryName();
		}
		
		return str;
	}

	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Gallery getGallery() {
		return gallery;
	}

	public void setGallery(Gallery gallery) {
		this.gallery = gallery;
	}

}
