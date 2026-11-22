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
            System.out.println("5. Update Your name");
            System.out.println("6. Close Account");
            System.out.println("7. Check Account Status");
            System.out.println("8. Exit");
            
            
            
            System.out.println("Enter Your choice : ");
            choice = sc.nextInt();
            
            switch(choice) {
            
            case 1 :
            	System.out.println(account1.toString());
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
            	System.out.println("Balance : "+account1.getBalance());
            	break;
            	
            case 5 :
            	sc.nextLine(); // Consume newline left by nextInt()
                System.out.println("Enter your new name:");
                String newName = sc.nextLine();
                account1.setAccountHolder(newName);;
                break;
                
            case 6 :
            	account1.closeAccount();
            	break;
            	
            case 7 :
            	System.out.println(account1.isAccountActive());
            	break;
            	
            case 8:
                System.out.println("Thank you for banking with us!");
                break;
            	
        	default :
        		System.out.println("Enter Valid Number from above selection");
            	
            }
			 
		 }while(choice != 8 );
			
		 sc.close();
	}
}
