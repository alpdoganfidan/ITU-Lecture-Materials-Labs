// Name, Surname: Alp Doğan Fidan
// Student ID: 090180320
// Question no: 1

package Midterm_Exam;

import java.util.ArrayList;

public class Customer {
	private final int customerId;
	private String name;
	private String address;
	private String phoneNumber;
	private ArrayList<Account> accounts;
	
	Customer(int customerId, String name, String address, String phoneNumber){
		this.customerId =customerId;
		this.name = name;
		this.setAddress(address);
		this.setPhoneNumber(phoneNumber);
	}

	public boolean addAccount(Account account) {
		if(account.hasExpired()) {
			return false;
		}
		
		if (this.accounts.size() < 9) {
            this.accounts.add(account);
            return true;
        } else {
            return false;
        }
	}
	
	public boolean searchAccount(Account account) {
		for (Account customerAccount: getAccounts()){
			if (account.equals(customerAccount)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean searchAccount(String accountNumber) {
		for (Account customerAccount: getAccounts()){
			if (accountNumber == customerAccount.getAccountNumber()) {
				return true;
			}
		}
		return false;
	}
	
	public boolean removeAccount(String accountNumber) {
		if (searchAccount(accountNumber)){
			for(int i = 0; i< this.accounts.size(); i++) {
				this.accounts.remove(i);
			}
		}
		return false;
	}
	
	public void listAccounts(int branchId) {
		for (Account account: getAccounts()){
			if (branchId == account.getBranch().getBranchId()) {
				System.out.printf(", AccountBalance : %d, BranchId : %d",account.getAccountNumber(),account.getAccountBalance(),branchId);
			}
		}
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
