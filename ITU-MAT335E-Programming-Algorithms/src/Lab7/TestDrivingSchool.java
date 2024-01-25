package Lab7;

public class TestDrivingSchool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DrivingSchool d1 = new DrivingSchool("Sean", 15);
			
			System.out.println("Name : "+d1.getName());
			System.out.println("Price : "+d1.getPrice());
			System.out.println("Register Status : "+d1.Register(13));
			
			
		}
		catch (Exception e){
			System.out.println("An error occured : "+e.getMessage());
		}
		
		
	}

}
