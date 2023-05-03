package com.InheritanceAssignment;

class Bank {
	String b_name;
	String city;
	String branch;
	float rate;

	Bank(String b_name,String city,String branch,float rate)
	{
		this.b_name=b_name;
		this.city=city;
		this.branch=branch;
		this.rate=rate;
	}
	class Axis extends Bank
	{
		
		Axis(String b_name,String city,String branch,float rate)
		{
			super(b_name,city,branch,rate);
		}
		void OpenAcc()
		{
			int age=0;
			if(age>60)
			{
				System.out.println("Rate of Interest is 7.8");
			}
			else if(age>40)
			{
				System.out.println("Rate of Interest is 6.4");
			}
			else if(age>18)
			{
				System.out.println("Rate of Interest is 5.5");
			}
				
		}
	}
  }

public class BankMain {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
