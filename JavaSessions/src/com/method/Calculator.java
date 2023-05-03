package com.method;
import java.util.Scanner;
	public class Calculator {
		void add(int a, int b)// LOCAL VERIABLE
		{
			System.out.println("Addition = " + (a + b));
		}

		void sub(int a, int b) {
			System.out.println("Substraction =" + (a - b));
		}

		void multiply(int a, int b) {
			System.out.println("Multiplication =" + (a * b));
		}

		void divide(int a, int b) {
			System.out.println("Divide =" + (a / b));
		}

		void square(int a) {
			System.out.println("square =" + (a * a));
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			Scanner sc = new Scanner(System.in);
			System.out.println("For Addition");
			System.out.println("Enter the two number = ");
			int a = sc.nextInt();
			int b = sc.nextInt();
			Calculator obj1 = new Calculator();
			obj1.add(a,b);
			System.out.println();
			System.out.println("For Substraction");
			System.out.println("Enter the two number = ");
			 a = sc.nextInt();
			 b = sc.nextInt();
			Calculator obj2 = new Calculator();
			obj2.sub(a,b);
			System.out.println();
			System.out.println(" For Multiplication");
			System.out.println("Enter the two number = ");
			 a = sc.nextInt();
			 b = sc.nextInt();
			Calculator obj3 = new Calculator();
			obj3.multiply(a,b);
			System.out.println();
			System.out.println("For Division");
			System.out.println("Enter the two number = ");
			 a = sc.nextInt();
			 b = sc.nextInt();
			Calculator obj4 = new Calculator();
			obj4.divide(a,b);
			System.out.println();
			System.out.println("For Square");
			System.out.println("Enter a number = ");
			 a = sc.nextInt();
			Calculator obj5 = new Calculator();
			obj5.square(a);
			
		/*  obj.sub();
			obj.multiply();
			obj.divide();
			obj.square();  */
		}

	}


