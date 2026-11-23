package com.bank;

//import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Bank bank= new Bank();
		
		String accountHolderName = "";
		long accountNumber;
		
		//BankAccount account1 = new BankAccount("Durga", 101, 1000);
		
		
//		bank.addAccount(new BankAccount("durga",1,1000));
//		bank.addAccount(new BankAccount("prasad",2,2000));
//		bank.addAccount(new BankAccount("tejaswi",3,5000));
		
		
		
		int choice;
		 do {
			 
			 System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");

			 System.out.println("1. Create New Account");
			 System.out.println("2. View Account Details");
			 System.out.println("3. Deposit Money");
			 System.out.println("4. Withdraw Money");
			 System.out.println("5. Check Balance");
//			 System.out.println("6. Update Account Holder Name");
//			 System.out.println("7. Close Account");
//			 System.out.println("8. Check Account Status");
//			 System.out.println("9. Display All Accounts");
			 System.out.println("10. Exit");

			 System.out.print("Enter your choice: ");
            
            
            
            System.out.println("Enter Your choice : ");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice) {
            
            case 1 :
            	
            	System.out.println("Enter Account Holder Name : ");
            	accountHolderName = sc.nextLine();
            	System.out.println("Enter Account Number : ");
            	accountNumber = sc.nextLong();
            	System.out.println("Enter Initial amount : ");
            	double amount = sc.nextDouble();
            	
            	//accounts.add(new BankAccount(accountHolderName,accountNumber,amount));
            	bank.addAccount(new BankAccount(accountHolderName,accountNumber,amount));
            	
            	break;
            
            case 2 :
            	System.out.println("enter your account number : ");
            	accountNumber = sc.nextLong();
            	System.out.println(bank.findAccount(accountNumber).toString());
            	break;
            
            case 3 :
            	System.out.println("enter your account number : ");
            	accountNumber = sc.nextLong();
            	if(bank.findAccount(accountNumber) != null) {
            		System.out.println("Enter Deposit amount ");
                	double depositAmount = sc.nextDouble();
                	bank.depositMoney(accountNumber, depositAmount);
            	}else {
            		System.out.println("Account Not Found");
            	}
          
            	break;
            	
            case 4 :
            	System.out.println("enter your account number : ");
            	accountNumber = sc.nextLong();
            	if(bank.findAccount(accountNumber) != null) {
            		System.out.println("Enter Withdraw amount ");
                	double depositAmount = sc.nextDouble();
                	bank.withdrawMoney(accountNumber, depositAmount);
            	}else {
            		System.out.println("Account Not Found");
            	}
            	break;
            	
            case 5 :
            	System.out.println("enter your account number : ");
            	accountNumber = sc.nextLong();
                System.out.println("Your Bank Balance : "+bank.checkBalance(accountNumber));
                break;
                
//            case 6 :
//            	account1.closeAccount();
//            	break;
//            	
//            case 7 :
//            	System.out.println(account1.isAccountActive());
//            	break;
            	
            case 10:
                System.out.println("Thank you for banking with us!");
                break;
            	
        	default :
        		System.out.println("Enter Valid Number from above selection");
            	
            }
			 
		 }while(choice != 10 );
			
		 sc.close();
	}
}
