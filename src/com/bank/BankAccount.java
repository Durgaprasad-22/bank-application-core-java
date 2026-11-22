package com.bank;

public class BankAccount {
	
	private String accountHolder;
	private long accountNumber;
	private double balance;
	
	
	
	/**
	 * @param accountHolder
	 * @param accoundNumber
	 * @param balance
	 */
	public BankAccount(String accountHolder, long accountNumber, double balance) {
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	
	
	public String getAccountHolder() {
		return accountHolder;
	}



	public void setAccountHolder(String accountHolder) {
		if(accountHolder !="" && accountHolder != null) {
		this.accountHolder = accountHolder;}
		else {
			System.out.println("Invalid name !");
		}
	}



	public long getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}



	@Override
	public String toString() {
	    return "accountHolder=" + accountHolder
	            + ",\naccountNumber=" + accountNumber
	            + ", \nbalance=" + balance;
	}



	public double getBalance() {
		return balance;
	}




	public void depoite(double amount) {
		
		if(amount > 0 ) {
			balance = balance + amount;
			System.out.println(amount+" is Deposited Successfully..!");
		}
		else {
			System.out.println("invalid deposite money");
		}
		
	}
	
	public void withdraw(double amount) {
		
		if ( amount > 0 && amount <= balance) {
			balance = balance - amount ;
			System.out.println(amount+" is debited from your account ");
		}else {
			System.out.println("Insufficient or invalide amount");
		}
		
		
	}
	
	
	

	

	
	
	

}
