package mat335Labs.Lab3;

public class TestEmployee {

	private String essn; // Sigorta numarası
	private double pricebyHour;
	private int workingYear;
	private boolean isRetired;
	
	public TestEmployee(String essn, int workingYear, double pricebyHour, boolean isRetired) {
		this.essn = essn;
		this.workingYear = workingYear;
		this.pricebyHour = pricebyHour;
		this.isRetired = isRetired;
	}
	
	public boolean deserveBonus() {
		return (this.workingYear >= 10 && !this.isRetired);
	}
	
	public double calculateSalary(int workingHour, int workingDays) {
		double salary = (this.pricebyHour * workingHour * workingDays);
		return salary;
	}

	public void retiring() {
		if (this.workingYear >= 20) {
			setIsRetired(true);
		}
	}
	
	public String getEssn() {
		return essn;
	}

	public void setEssn(String essn) {
		this.essn = essn;
	}

	public double getPricebyHour() {
		return pricebyHour;
	}

	public void setPricebyHour(double pricebyHour) {
		this.pricebyHour = pricebyHour;
	}

	public int getWorkingYear() {
		return workingYear;
	}

	public void setWorkingYear(int workingYear) {
		this.workingYear = workingYear;
		
		retiring();
	}

	public boolean getIsRetired() {
		return isRetired;
	}

	public void setIsRetired(boolean isRetired) {
		this.isRetired = isRetired;
	}
	
	
	
}
