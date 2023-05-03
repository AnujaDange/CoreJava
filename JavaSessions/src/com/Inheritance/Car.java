package com.Inheritance;

public class Car {
        int price ;
        String color;
      
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	 
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	void wheelNo()
    {
 	   System.out.println("All Cars will have 4 wheels");
    }
	void dashboard()
	{
		System.out.println("Every car will have dashboard with music");
	}
}
