package com.bank;

import java.util.ArrayList;

public class Bank {

    private ArrayList<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account created successfully!");
    }


    public BankAccount findAccount(long accountNumber) {
    	for (BankAccount account : accounts) {
    		
    		if(account.getAccountNumber() == accountNumber) {
    			return account;
    		}
    	}
    	
    	return null;
    }
    
//    public boolean foundAccount(long accountNumber) {
//    	for (BankAccount account : accounts) {
//    		
//    		if(account.getAccountNumber() == accountNumber) {
//    			return true;
//    		}
//    	}
//    	
//    	return false;
//    }

    public void displayAllAccounts() {

        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
            return;
        }

        for (BankAccount account : accounts) {
            account.displayDetails();
            System.out.println("----------------------");
        }
    }
    
    public void depositMoney(long accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);

        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
    }
    
    public void withdrawMoney(long accountNumber, double amount) {
    	BankAccount account = findAccount(accountNumber);

        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
    }
    
    public double checkBalance(long accountNumber) {
    	BankAccount account = findAccount(accountNumber);

        if (account != null) {
           return account.getBalance();
        } else {
            System.out.println("Account not found!");
        }
        
        return 0;
    }
}
