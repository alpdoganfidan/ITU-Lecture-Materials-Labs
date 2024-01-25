// Name, Surname: Alp Doğan Fidan
// Student ID: 090180320
// Question no: 1

package Midterm_Exam;

import java.time.LocalDate;

public class Account {
	private final String accountNumber;
	private double accountBalance;
	private double previousAccountBalance;
	private LocalDate expiredDate;
	private Branch branch;

	public Account(String accountNumber,double accountBalance, LocalDate expiredDate, Branch branch) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.expiredDate = expiredDate;
		this.branch = branch;
	}
	
	public boolean hasExpired() {
		if (getExpiredDate().isBefore(LocalDate.now()))
			return true;
		return false;
	}
	
	public boolean withdraw(double amount) {
		if (amount <= 2000 && getAccountBalance() >= amount + 20) {
			setPreviousAccountBalance(getAccountBalance());
			setAccountBalance(getAccountBalance() - (amount + 20));
			messageForTransaction();
			return true;
		}
		messageForTransaction();
		return false;
	}
	
	public boolean deposit(double amount) {
		if (amount <= 3000  && getAccountBalance() + amount <= 10000) {
			setPreviousAccountBalance(getAccountBalance());
			setAccountBalance(getAccountBalance() + amount);
			messageForTransaction();
			return true;
		}
		messageForTransaction();
		return false;
	}

	public void messageForTransaction() {
		double diffBalance = getAccountBalance() - getPreviousAccountBalance();
		if (diffBalance<0) {
			System.out.printf("%f TL was withdrawn from your account\n",diffBalance);
		}
		else if (diffBalance >0) {
			System.out.printf("%f TL was deposited from your account\n",diffBalance);
		}
		else {
			System.out.println("“Transaction is unsuccessful");
		}
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public double getPreviousAccountBalance() {
		return previousAccountBalance;
	}

	public void setPreviousAccountBalance(double previousAccountBalance) {
		this.previousAccountBalance = previousAccountBalance;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
}