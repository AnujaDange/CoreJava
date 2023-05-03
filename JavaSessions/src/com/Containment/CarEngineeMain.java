package com.Containment;

public class CarEngineeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         CarEnginee e1=new CarEnginee();
         e1.setPower(20);
         CarEnginee e2=new CarEnginee();
         e2.setPower(20);
         e2.setCompany("Abdoc");
         Car c=new Car();
         c.setId(1);
         c.setPrice(3000000);
         c.setName("Anuja");
         c.setCarEnginee(e1);
         
         
	}

}
