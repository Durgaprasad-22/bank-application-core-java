package com.bank;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		BankAccount account1 = new BankAccount("Durga", 101, 1000);
		
		int choice;
		 do {
			 
            System.out.println("\n===== BANK MENU =====");
            System.out.println("1. View Account Details");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            
            System.out.println("Enter Your choice : ");
            choice = sc.nextInt();
            
            switch(choice) {
            
            case 1 :
            	account1.displayDetails();
            	break;
            
            case 2 :
            	System.out.println("enter amount you want to deposit ");
            	double depositMoney = sc.nextDouble();
            	account1.depoite(depositMoney);
            	break;
            
            case 3 :
            	System.out.println("Enter withdraw amount ");
            	double withdrawMoney = sc.nextDouble();
            	account1.withdraw(withdrawMoney);
            	break;
            	
            case 4 :
            	account1.checkBalance();
            	break;
            	
            case 5:
                System.out.println("Thank you for banking with us!");
                break;
            	
        	default :
        		System.out.println("Enter Valid Number from above selection");
            	
            }
			 
		 }while(choice != 5 );
			
		 sc.close();
	}
}
