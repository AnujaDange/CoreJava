package com.assignment_29_03;

import java.util.Scanner;

public class A_04_AreaOfRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int area;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length and Breadth of rectangle =");
		int l = input.nextInt();
		int b = input.nextInt();
		area = l * b;
		System.out.println("Area of Rectangle = " + area);
	}

}
