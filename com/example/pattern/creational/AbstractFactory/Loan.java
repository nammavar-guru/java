package com.example.pattern.creational.AbstractFactory;

public abstract class Loan {
	protected double interestRate;
	abstract void getInterestRate(double interestRate);
	public void calculateLoanPayment(double loanamount, int years)  
	   { 
		double EMI;  
        int n;  
 
        n=years*12;  
        interestRate=interestRate/1200;  
        EMI=((interestRate*Math.pow((1+interestRate),n))/((Math.pow((1+interestRate),n))-1))*loanamount;  
 
System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanamount+" you have borrowed");     

	   }
}
