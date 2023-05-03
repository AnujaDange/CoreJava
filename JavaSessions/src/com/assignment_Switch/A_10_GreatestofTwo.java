package com.assignment_Switch;

import java.util.Scanner;

public class A_10_GreatestofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1,no2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number =");
		no1=sc.nextInt();
		no2=sc.nextInt();
		
		switch(no1>=no2)
		{
		case 0 :
			System.out.println(no1+" is greater than"+ no2);
			break;
		case 1 :
			System.out.println(no1+" is less than"+ no2);
			break;
			default:
			System.out.println("Invalid");
		}
	}

}
