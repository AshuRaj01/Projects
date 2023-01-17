package project;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterF
{   //creating object of ATM class
    ATM atm = new ATM();
    
    //for ministatments
    Map<Double,String>ministatment = new HashMap<>();
	
	@Override
	public void viewBalance() 
	{       //View Balance
		System.out.println("Available Balance is : "
				+ atm.getBalance());
	}

	@Override
	public void withdrawAmount(double withdrawAmount) 
	{
		//Withdraw Amount
		if(withdrawAmount<atm.getBalance())
		{
			ministatment.put(withdrawAmount,"Amount Withdrawn");// for miniStatments
			atm.setBalance(atm.getBalance()-withdrawAmount);
			viewBalance();
		}
		else
		{
			System.out.println("You have insufficient Balance in Your Account.. \n"
					+ "Please Enter Amount Less then your Current Balance .....");
		}
	}

	@Override
	public void depositAmount(double depositAmount) 
	{
	   //for Deposit Amount
		ministatment.put(depositAmount,"Amount Deposited..");// for miniStatments
	    System.out.println(depositAmount+" Deposited Successfullu !!");	
	    atm.setBalance(atm.getBalance()+depositAmount);
	    viewBalance();
	}

	@Override
	public void viewMinistatment() 
	{   //View Mini Statments
		for(Map.Entry<Double, String> m:ministatment.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	} 
}
