package com.assignment_29_03;

import java.util.Scanner;

public class A_05_CircleD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double diameter,area,circumference,pi=3.14;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter Radius of Circle = ");
          double radius = sc.nextInt();
          diameter=2*radius;
          System.out.println("Diameter = "+diameter);
          circumference =2*pi*radius;
          System.out.println("Circumference = "+circumference);
          area=pi*radius*radius;
          System.out.println("Area = "+area);
          
	}

}
