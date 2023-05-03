package com.Containment;

public class Address {
	private String city;
	private String state;
	Address()
	{
		
	}
	Address(String city,String state)
	{
		this.city=city;
		this.state=state;
	}
 public String getcity()
 {
	 return city;
 }
 public void setcity(String city)
 {
	 this.city=city;
 }
 public String getstate()
 {
	 return state;
 }
 public void setstate(String state)
 {
	 this.state=state;
 }
 
 public String toString()
 {
	return city+" "+state; 
 }
	/*
	 * void display() { System.out.println("city "+city);
	 * System.out.println("state"+state); }
	 */
	
}