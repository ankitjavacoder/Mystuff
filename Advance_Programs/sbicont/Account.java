package sbiUsingIf;

public class Account {

	private String accountHolderName;
	private String accountHolderNumber;
	private double balance = 10000;
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountHolderNumber() {
		return accountHolderNumber;
	}
	public void setAccountHolderNumber(String accountHolderNumber) {
		this.accountHolderNumber = accountHolderNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		}
		else return false;
	}
	public boolean deposit (double amount) {
		if (amount > 0) {
			balance += amount;
			return true;
		}
		else return false;
	}
	public void getDetails() {
		System.out.println("Account Holder Name : " + this.getAccountHolderName());
		System.out.println("Account Holder Number : " + this.getAccountHolderNumber());
		System.out.println("Balance : " + this.getBalance());
	}
}