package mat335Labs.Lab3;

public class Lab3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myEssn = "23217";
		double myPricebyHour = 300;
		int myWorkingYear = 14;
		boolean myIsRetired = false;
		
		
		TestEmployee testEmployee1 = new TestEmployee(
				myEssn,
				myWorkingYear,
				myPricebyHour,
				myIsRetired
				);
		
		//System.out.println(testEmployee.getPricebyHour());
		//System.out.println(testEmployee.getWorkingYear());
		//System.out.println(testEmployee.getIsRetired());
		
		System.out.println("Deserve Bonus = " + testEmployee1.deserveBonus());
		System.out.println("Retiring Status = " + testEmployee1.getIsRetired());
		testEmployee1.setWorkingYear(21);
		System.out.println("Working Year = " + testEmployee1.getWorkingYear());
		System.out.println("Retiring Status = "+ testEmployee1.getIsRetired());
		System.out.println("Deserve Bonus = " + testEmployee1.deserveBonus());
		System.out.println("Salary = " + testEmployee1.calculateSalary(8, 20));

		
	}

}
