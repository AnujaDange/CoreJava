package com.assignment_29_03;

import java.util.Scanner;

public class A_03_PeriOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int perimeter;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Length and Breadth of triangle = ");
		int l = input.nextInt();
		int b = input.nextInt();
		perimeter = 2*(l + b);
		System.out.println("Perimeter = " + perimeter);

	}

}
