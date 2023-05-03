package com.assignment_Switch;

import java.util.Scanner;

public class A_09_Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" 1. Area of a circle ");
		System.out.println(" 2. Area of a square ");
		System.out.println(" 3. Area of a right angled triangle ");
		System.out.println(" 4. Area of a rectangle ");
		System.out.println(" 5. Circumference of circle");
		System.out.println("Enter your choice = ");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			int r;
			float pi = 3.14f;
			System.out.println("Enter radius of circle = ");
			r = sc.nextInt();
			System.out.println("Area of a circle = " + (pi * r * r));
			break;
		case 2:
			int a;
			System.out.println("Enter side = ");
			a = sc.nextInt();
			System.out.println("Area of a square = " + (a * a));
			break;
		case 3:
			int b,h;
			System.out.println("Enter breadth and height =");
			b = sc.nextInt();
			h = sc.nextInt();
			System.out.println("Area of a right angled triangle= " + (0.5*b*h));
			break;
		case 4:
			int l,w;
			System.out.println("Enter length and width = ");
			l = sc.nextInt();
			w = sc.nextInt();
			System.out.println("Area of a rectangle = " + (l*w));
			break;
		case 5:
			int ra;
			float p = 3.14f;
			System.out.println("Enter radius of circle = ");
			ra = sc.nextInt();
			System.out.println("Area of a circle = " + (2 * p * ra));
			break;
		default:
			System.out.println("Invalid choice !!!");

		}

	}

}
