package com.Inheritance;

public class CarMain {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HondaCity c= new HondaCity();
         c.wheelNo();
         c.dashboard();
         c.airBags();
        
         c.setMilage(25);
         c.setColor("Black");
         c.setPrice(1500000);
         System.out.println(c.getPrice()+"/n"+c.getColor()+"/n"+c.getMilage());
	}

}
