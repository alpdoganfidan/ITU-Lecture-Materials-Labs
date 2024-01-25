package Lab8;

public class Gallery {
	private String galleryName;
	private Car[] cars;
	private int carCount;
	private int capacity;
	private Person galleryOwner;

	public Gallery(String galleryName, int capacity, Person galleryOwner) {
		this.galleryName = galleryName;
		this.capacity = capacity;
		this.galleryOwner = galleryOwner;
		this.carCount = 0;
		this.cars = new Car[capacity];
	}
	
	public String introduceSelf() {
		String str = "Galery Name : "+getGalleryName();
		str += "\nGallery Owner : "+getGalleryOwner().getName();
		str += "\nCar Count :"+getCarCount();
		
		return str;
	}
	
	public boolean addCar(Car myCar) {
		
		if (getCarCount()>=getCapacity()) {
			return false;
		}
		
		if(searchCar(myCar)) {
			return false;
		}
		
		this.cars[getCarCount()] = myCar;
		setCarCount(getCarCount()+1);
		
		return true;
	}

	public boolean searchCar(Car myCar) {
		for (Car car: getCars()){
			if (myCar.equals(car)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean searchCar(String plate) {
		for (Car car: getCars()){
			if (plate == car.getPlate()) {
				return true;
			}
		}
		return false;
	}
	
	public String getGalleryName() {
		return galleryName;
	}

	public void setGalleryName(String galleryName) {
		this.galleryName = galleryName;
	}

	public Person getGalleryOwner() {
		return galleryOwner;
	}

	public void setGalleryOwner(Person galleryOwner) {
		this.galleryOwner = galleryOwner;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	public int getCarCount() {
		return carCount;
	}

	public void setCarCount(int carCount) {
		this.carCount = carCount;
	}
	
	
}
