package com.assignment_Switch;

import java.util.Scanner;

public class A_02_EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number = ");
		int no=sc.nextInt();
		switch(no%2)
		{
		case 0:
			System.out.println(no+" is even");
			break;
		case 1 : 
			System.out.println(no+" is odd");
			break;
			default :
				System.out.println("Invalid choice !!!");
		}
	}

}
