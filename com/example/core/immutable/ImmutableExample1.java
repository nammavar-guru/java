package com.example.core.immutable;

final class User1 {
	private final String firstName;
	private final String lastName;
	private final Address1 address;
	

//If the class holds a mutable object:
//Inside the constructor, make sure to use a clone copy of the passed argument and never set your mutable field to the real instance passed through constructor, this is to prevent the clients who pass the object from modifying it afterwards.
//Make sure to always return a clone copy of the field and never return the real object instance.
		
	public User1(String firstName, String lastName, Address1 address) {
		this.firstName = firstName;
		this.lastName = lastName;
		//this.address = address;
		Address1 cloneAddress = new Address1();
		cloneAddress.setStreet1(address.getStreet1());
		cloneAddress.setStreet2(address.getStreet2());
		this.address = cloneAddress;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address1 getAddress() {
		Address1 cloneAddress = new Address1();
		cloneAddress.setStreet1(address.getStreet1());
		cloneAddress.setStreet2(address.getStreet2());
		return cloneAddress;
	}

	@Override
	public String toString() {
		return "User1 [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	
	
}

class Address1{
	String street1;
	String street2;
	String city;
	
	public Address1() {}
	

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address1 [street1=" + street1 + ", street2=" + street2 + ", city=" + city + "]";
	}
	
	
}
public class ImmutableExample1 {

	public static void main(String[] args) {
		Address1 a = new Address1();
		a.setCity("TKM");
		a.setStreet1("street1");
		a.setStreet2("street2");
		User1 u = new User1("guru","murugesan", a);
		System.out.println(u);
		a.setStreet1("test1");
		u.getAddress().setStreet1("test1");
		System.out.println(u);
		
	}

}
