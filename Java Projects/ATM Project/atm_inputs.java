package project;

import java.util.Scanner;

public class atm_inputs 
{      //creating ATM_Inputs Method for all Inputs
	public void atm_Inputs()
    {   // Creating Object for calling all methods 
    	AtmOperationImpl AO = new AtmOperationImpl();
		int ATM_Number = 12345;
		int ATM_PIN = 1469;
		
		//using Scanner class for User Inputs 
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOME TO ATM :)");
		
		System.out.print("Enter ATM Number : ");
		int atm_number = sc.nextInt();
		
		System.out.print("Enter ATM PIN : ");
		int atm_pin = sc.nextInt();
		
		
		
		if((ATM_Number==atm_number)&&(ATM_PIN==atm_pin))
		{
			System.out.println("Validation Done :)");
		    while(true)
		    {
		    	System.out.println("1. View Available Balance\n"
		    			+ "2. Deposit Amount \n3. Withdraw Amount\n"
		    			+ "4. View Ministatment\n5. Exit");
                System.out.println("Enter Choice : ");
                int ch = sc.nextInt();
                if(ch==1)
                {   
                	AO.viewBalance();
                }
                else if(ch==2)
                {
                	System.out.println("Enter Amount to Deposit : ");
                	double depositAm = sc.nextDouble();
                	AO.depositAmount(depositAm);
                }
                else if(ch==3)
                {
                	System.out.println("Enter Amount to Withdraw : ");
                	double withdrawAm = sc.nextDouble();
                	AO.withdrawAmount(withdrawAm);
                }
                else if(ch==4)
                {
                	AO.viewMinistatment();
                }
                else if(ch==5)
                {
                	System.out.println("Collect your ATM Card\n"
                			+ "Thank you for using ATM Machin");
                }
                else
                {
                	System.out.println("Please Enter Vailid Option :)");
                }
		    }
		    
		}
		else
		{
			System.out.println("Incorrect ATM Number or PIN \n Please enter Vailid inputs :)");
            System.exit(0);
		}    		
    }
}
