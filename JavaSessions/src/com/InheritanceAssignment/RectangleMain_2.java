
/* 2. Create a class named 'Rectangle' with two data members 'length' and
  'breadth' and two methods to print the area and perimeter of the rectangle
   respectively. Its constructor having parameters for length and breadth is
   used to initialize length and breadth of the rectangle. Let class 'Square'
   inherit the 'Rectangle' class with its constructor having a parameter for its
   side (suppose s) calling the constructor of its parent class as 'super(s,s)'.
   Print the area and perimeter of a rectangle and a square.
*/
package com.InheritanceAssignment;

import java.util.Scanner;

class Rectangle
  {
     int length,breadth;
     int area;
     
     Rectangle(int length,int breadth)
     {
    	this.length=length;
    	this.breadth=breadth;
     }
     void display()
     {
    	 System.out.println("Length ="+length+" Breadth"+breadth);
     }
     void area()
     {
    	area=length*breadth;
    	System.out.println("Area of Rectangle = "+area);
     }
     void perimeter()
     {
    	int peri = 2*(length+breadth);
    	System.out.println("Perimeter of Rectangle = "+peri);
     }
}
     class Square extends Rectangle
     {
    	 int area;
    	 int side;
    	 Square(int side,int length,int breadth)
    	 {   
    		 super(length,breadth); 
    		 this.side=side;
    	 }
    	 void display()
    	 {
    		 super.display();
    		 System.out.println("Side = "+side);
    	 }
    	 void area()
    	 {
    		 area=side*side; 
    		 System.out.println("Area of Square = "+area);
    	 }
    	 void perimeter()
    	 {
    		 int peri = 4*side;
    		 System.out.println("Perimeter of Square =  "+peri);
    	 }
    	
    	
     }
     class RectangleMain_2 
     {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter length");
			int length=sc.nextInt();
			System.out.println("Enter breadth");
			int breadth=sc.nextInt();
			System.out.println("Enter side = ");
			int side = sc.nextInt();
			Square obj = new Square(side,length,breadth);
			obj.display();
			obj.area();
			obj.perimeter();
	}		
			
	}


