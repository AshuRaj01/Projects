package project;

public class ATM 
{   //create Private Variables using Encapsulation
    private double balance;
    private double depositAmount;
    private double withdrawAmount;
    
    //create Default Constructor
    public void Atm()
    {
    	
    }
    
    
    //getter and setter methods
    
    //for balance
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//for depositAmount
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	
	//For withdrawAmount
	public double getWithdrawAmount() {
		return withdrawAmount;
	}
	public void setWithdrawAmount(double withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
    
}
