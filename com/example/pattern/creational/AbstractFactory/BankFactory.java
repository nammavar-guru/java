package com.example.pattern.creational.AbstractFactory;

public class BankFactory extends AbstractFactory {

	public Bank getBank(String bank) {
		if(bank.equalsIgnoreCase("icici")) {
			return new ICICIBank();
		}
		else if(bank.equalsIgnoreCase("hdfc")) {
			return new HDFCBank();
		}
		return null;
	}

	public Loan getLoan(String loan) {  
	      return null;  
	   }
}
