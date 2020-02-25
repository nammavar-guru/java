package com.example.core.immutable;

final class User {
	private final String firstName;
	private final String lastName;
	private final Address address;
	
	public User(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	
	
}

class Address{
	String street1;
	String street2;
	String city;
	
	public Address(String street1, String street2, String city) {
		super();
		this.street1 = street1;
		this.street2 = street2;
		this.city = city;
	}

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
		return "Address [street1=" + street1 + ", street2=" + street2 + ", city=" + city + "]";
	}
	
	
}
public class ImmutableExample {

	public static void main(String[] args) {
	
		User u = new User("guru","murugesan", new Address("street1","street2","Thakkolam"));
		System.out.println(u);
		Address a = u.getAddress();
		System.out.println(a);
		User u2  = new User("gurunathan","murugesan", new Address("hdhdh","street2","Thakkolam"));
		u2.getAddress().setStreet1("test1");
		System.out.println(u2);
		
	}

}
