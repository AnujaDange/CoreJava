package com.Containment;

public class AddressPerson {
	private int id;
	String name;
	double contact;
	String person;
	Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public double getContact()
	{
		return contact;
	}
	public void setContact(double contact)
	{
		this.contact=contact;
	}
	
	
	public Address getAddress()
	{
		return address;
	}
	public void setAddress(Address address)
	{
		this.address =address;
		
	}
	public String toString()
	{
		return id+" "+name+" "+contact+" "+address;
	}
	/*
	 * void display() {
	 * System.out.println(" id "+getId()+" name "+name+"contact"+contact);
	 * System.out.println(); }
	 */
	
	
}