package simpleExample;

public class BankAccount implements Measureable{
	
	private double balance;
	
	public BankAccount() {
		this.balance = 0;
	}
	
	public double getMeasure(){
		return getBalance();
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	
}
