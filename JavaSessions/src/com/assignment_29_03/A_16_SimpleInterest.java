package com.assignment_29_03;

import java.util.Scanner;

public class A_16_SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// principal amount, rate, time and simple interest 
		Scanner sc = new Scanner(System.in);
		int pa,rate,time,sp;
		System.out.println("Enter principal amount = ");
		pa=sc.nextInt();
		System.out.println("Enter rate = ");
		rate=sc.nextInt();
		System.out.println("Enter time = ");
		time=sc.nextInt();
		sp=(pa*rate*time)/100;
		System.out.println("Simple Interest = "+sp);
		
	}

}
