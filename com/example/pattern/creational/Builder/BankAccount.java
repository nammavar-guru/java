package com.example.pattern.creational.Builder;

public class BankAccount {
	private String name;
	private int mobileNumber;
	private String email;
	private boolean newsLetter;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isNewsLetter() {
		return newsLetter;
	}
	public void setNewsLetter(boolean newsLetter) {
		this.newsLetter = newsLetter;
	}
	
	private BankAccount(BankAccountBuilder bab) {
		this.name = bab.name;
		this.mobileNumber = bab.mobileNumber;
		this.email = bab.email;
		this.newsLetter = bab.newsLetter;
	}
	
	public static class BankAccountBuilder{
		private String name;
		private int mobileNumber;
		private String email;
		private boolean newsLetter;
		
		public BankAccountBuilder(String name, int mobileNumber) {
			this.name=name;
			this.mobileNumber = mobileNumber;
		}

		
		public void  setEmail(String email) {
			this.email = email;
			//return this;
		}

		public void  setNewsLetter(boolean newsLetter) {
			this.newsLetter = newsLetter;
			//return this;
		}
		
		
		public BankAccount build() {
			return new BankAccount(this);
		}
		
		
	}
}
