package ps3;


import java.util.Date;
//PS3
public class Account {
	private int id=0;
	private double balance=0;
	private double annualInterestRate=0;
	private Date dateCreated;
	
	public Account(){
		id=0;
		balance=0;
		annualInterestRate=0;
		dateCreated = new Date();
	}

	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate/12;
		} 
	
	public void withdraw(double totalWithdraw) throws InsufficientFundsException{
		if (totalWithdraw < balance){
			balance-=totalWithdraw;
		} else {
			throw new InsufficientFundsException(totalWithdraw);
		}
	}
	
	public void deposit(double amount){
		balance+=amount;
	}
	
	
}