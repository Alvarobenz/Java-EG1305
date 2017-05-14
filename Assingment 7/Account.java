import java.util.*;
public class Account {

	private int id;
	private double balance;
	private double annualInterestRate;
	private String dateCreated;
	
	
	public Account(int id1, double balance1, double annualInterestRate1){
		id1 = id;
		balance1 = balance;
		annualInterestRate1 = annualInterestRate;
	}
	
	public void setId(int id1){
		id = id1;
		
	}
	
	public int getId(){
		return id;
	}
	
	public void setBalance(double balance1){
		balance = balance1;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate1){
		annualInterestRate = annualInterestRate1;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	public String dateCreated(){
		Date today = new Date();
		dateCreated = "" + today;
		return dateCreated;
	}
	
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;
	}
	
	public void withdraw(double cash){
		balance -= cash;
	}
	
	public void deposit(double cash){
		balance += cash;
	}
	                                                                                                                                                                                                                                                                                                                                                                                                     
	public Account(){
		
	}
}
