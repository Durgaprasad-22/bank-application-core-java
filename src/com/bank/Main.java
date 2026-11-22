package com.bank;

public class Main {

	public static void main(String args[]) {
		
		BankAccount account1 = new BankAccount("Durga", 101, 1000);
		
		account1.checkBalance();
		account1.depoite(500);
		account1.displayDetails();
	}
}
