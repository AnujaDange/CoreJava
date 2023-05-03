package com.Polymorphism;

public class Addition {

	   void add(int a,int b)
	   {
		   System.out.println("Addition = "+(a+b));
	   }
	   void add(int a,int b, int c)
	   {
		   System.out.println("Addition = "+(a+b+c));
	   }
	   void add(float a,int b)
	   {
		   System.out.println("Addition = "+(a+b));
	   }
	   void add(double a,int b)
	   {
		   System.out.println("Addition = "+(a+b));
	   }
	   void add(String a,int b)
	   {
		   System.out.println("Addition = "+a+" "+b);
	   }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition obj = new Addition();
		obj.add(12,2);
		obj.add(10,2,7);
		obj.add(9.8,12);
		obj.add(88.24,12);
		obj.add("Priti",12);
	}

}
