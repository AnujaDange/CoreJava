  // Write a Java program to enter length and breadth of a rectangle and find its perimeter.
package com.WrittenBasic_1;

import java.util.Scanner;

public class A_01_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Lenght and Breadth of rectangle = ");
			int length = sc.nextInt();
			int breadth =sc.nextInt();
			int perimeter ;
			perimeter=2*(length+breadth);
			System.out.println("Perimeter of Rectangle = "+perimeter);
	}

}
