package com.example.pattern.creational.Builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
	
		
		Computer comp = new  Computer.ComputerBuilder("1TB", "8 GB RAM").build();
		comp.setBluetoothEnabled(true);
		comp.setGraphicsCardEnabled(false);
		
		System.out.println("HDD"+comp.getHDD()+"\n RAM Size:"+comp.getRAM());
		System.out.println("Blue Tooth Enabled"+comp.isBluetoothEnabled()+"\n Graphics Card Enabled:"+comp.isGraphicsCardEnabled());
		
		StringBuilder sb= new StringBuilder("sb");
		sb.append(4).append(false);
		System.out.println("String Builder :"+sb);
		
		String st = new String("s");
		System.out.println("String :"+st);
		

		
		BankAccount ba = new BankAccount.BankAccountBuilder("guru", 9846525).build();
		ba.setEmail("hghg@h.com");
		ba.setNewsLetter(false);
		System.out.println("name"+ba.getName());
		System.out.println("mobile number"+ba.getMobileNumber());
		System.out.println("email"+ba.getEmail());
		
	}

}
