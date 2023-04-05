package com.assignment_29_03;

import java.util.Scanner;

public class A_14_Equilateral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter value of side = ");
       int a=sc.nextInt();
       double area=0.00;
       // area of equilateral triangle = root3/4*side*side
       
       area=(1.73*a*a)/4;
       System.out.println("Area of Equilateral Triangle = "+area);
       
       
	}

}
