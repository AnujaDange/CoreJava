package com.WrittenBasic_3;

public class Address2 {
	   String city;
	 String state;
	 String country;
    Address2(String city,String state,String country)
    {
    	this.city=city;
    	this.state=state;
		this.country=country;
    }
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
