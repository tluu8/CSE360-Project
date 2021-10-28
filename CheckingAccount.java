package CheckingAccount;

/**
 * Program Name: CheckingAccount.java
 *  @author Tuan Luong Luu
 *  Date: 1/30/2020
 *  Brief Description: A child class of BankAccount class.
 *  
 */

public class CheckingAccount extends BankAccount {

	private double transactionFee;
	
	public CheckingAccount() {
		super();
		transactionFee = 0.0;
	}
	
	public CheckingAccount(int accNum, String name, double balance, double transactionFee) {
		super (accNum, name, balance);
		this.transactionFee = transactionFee;
	}
	
	public double getTransactionFee() {
		return transactionFee;
	}
	
	public void setTransactionFee(double fee) {
		transactionFee = fee;
	}
	
	public void deposit(double amount) {
		super.deposit(amount - transactionFee);
	}
	
	public void withdraw(double amount) {
		super.withdraw(amount - transactionFee);
	}
	
	public String toString() {
		return super.toString() + "\nTransaction fee: " + transactionFee;
	}
}
