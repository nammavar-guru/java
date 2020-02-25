package com.example.pattern.creational.AbstractFactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String bankName ="icici";
		String loanType="home";
		double loanAmount=2500000;
		double interestRate=8.5;
		int numberOfyear=5;
		
		AbstractFactory afb= FactoryCreator.getFactory("bank");
		Bank b = afb.getBank(bankName);
		AbstractFactory afl= FactoryCreator.getFactory("loan");
		Loan l = afl.getLoan(loanType);
		l.getInterestRate(interestRate);
		l.calculateLoanPayment(loanAmount, numberOfyear);
		
	}

}
