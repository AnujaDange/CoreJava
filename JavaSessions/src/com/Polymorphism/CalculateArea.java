package com.Polymorphism;

public class CalculateArea {

	    void area(float r)
	    {
	    	System.out.println("Circle = "+(3.14*r*r));
	    }
	    void area(int l,int b)
	    {
	    	System.out.println("Rectangle ="+(l*b));
	    }
	    void area(int a)
	    {
	    	System.out.println("Square ="+(a*a));
	    }
	    void area(float b,int h)
	    {
	    	System.out.println("Triangle ="+(0.5*b*h));
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateArea obj=new CalculateArea();
		obj.area(3);
		obj.area(4,6);
		obj.area(4);
	    obj.area(3.8f,6);
	}

}
