package com.method;

import java.util.Scanner;

public class Calculations {

	  void add(int a,int b)
	  {
		  System.out.println("Addition = "+(a+b));
	  }
	  void multiplication(int a,int b)
	  {
		  System.out.println("Multiplication = "+(a*b));
	  }
	  void square(int a)
	  {
		  System.out.println("Square = "+(a*a));
	  }
	  void divide(int a ,int b)
	  {
		  System.out.println("Division ="+(a/b));
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Calculations obj = new Calculations();
		
		System.out.println("Enter two number for add,multi,division");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		obj.add( n1, n2);
		obj.multiplication( n1,n2);
		obj.square(5);
		obj.divide(n1,n2);
	}

}
