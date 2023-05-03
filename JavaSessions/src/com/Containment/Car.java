package com.Containment;

public class Car {
   
       private int id;
	private int price;
       private String name;
	private String company;
       private CarEnginee engin;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public CarEnginee getEngin() {
		return engin;
	}
	public void setEngin(CarEnginee engin) {
		this.engin = engin;
	}
       
}
