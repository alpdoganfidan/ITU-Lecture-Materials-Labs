// Name, Surname: Alp Doğan Fidan
// Student ID: 090180320
// Question no: 1

package Midterm_Exam;

public enum Branch {
	
	COMMERCIAL(1),
	PRIVATE(2),
	SME(1);
	
	private int branchId;
	
	Branch(int branchId) {

		this.branchId = branchId;
	}

	public double getBranchId() {
		return branchId;
	}
}
