package com.example.pattern.creational.AbstractFactory;

public class LoanFactory extends AbstractFactory {

	public Loan getLoan(String loan) {
		if(loan.equalsIgnoreCase("personal")) {
			return new PersonalLoan();
		}
		else if(loan.equalsIgnoreCase("Home")) {
			return new PersonalLoan();
		}
		return null;
	}

	public Bank getBank(String bank) {  
	      return null;  
	   }
}
