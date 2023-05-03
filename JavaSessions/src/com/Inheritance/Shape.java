package com.Inheritance;

public class Shape {

	   void area(int r)
	   {
		   double area=3.14*r*r;
		   System.out.println("Area of Circle = "+area);
	   }
	   void area(int l,int b)
	   {
		  int area=l*b;
		  System.out.println("Area of Rectangle = "+area);
	   }
	   void area(float b,float h)
	   {
		   float a=0.5f;
		   float area=a*b*h;
		   System.out.println("Area of Triangle = "+area);
	   }
	   static void calArea(int a)
	   {
		   int sq = a*a;
		   System.out.println("Square = "+sq);
	   }
	   static void calArea(int l,int b)
	   {
		   int peri=2*(l+b);
		   System.out.println("Perimeter = "+peri);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		s.area(4);
		s.area(3,8);
		s.area(1.5f,2.0f);
		Shape.calArea(5);
		Shape.calArea(3,4);
		
	}

}
