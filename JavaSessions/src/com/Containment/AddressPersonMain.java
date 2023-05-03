package com.Containment;

public class AddressPersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address e1=new Address();
		e1.setcity("Pune");
		e1.setstate("Maharashtra");
		
		
		Address e2=new Address();
		e2.setcity("Mumbai");
		e2.setstate("Maharashtra");
	
		
		AddressPerson c1=new AddressPerson();
		c1.setId(12);
		c1.setName("Anuja");
		c1.setContact(1234567896);
		c1.setAddress(e1);
		System.out.println(c1);
		
		
		
		AddressPerson c2=new AddressPerson();
		c2.setId(12);
		c2.setName("Gayatri");
		c2.setContact(1234567896);
		c2.setAddress(e2);
		System.out.println(c2);
		

	}

}
