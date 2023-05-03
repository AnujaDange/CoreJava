package com.assignment_29_03;

import java.util.Scanner;

public class A_17_CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pa,r,t;
		float ci;
		System.out.println("Enter principal amount = ");
		pa=sc.nextInt();
		System.out.println("Enter rate = ");
		r=sc.nextInt();
		System.out.println("Enter time = ");
		t=sc.nextInt();
		ci = (float)(pa * (Math.pow((1 + r / 100), t)));
		System.out.println("Compound Interest = "+ci);
	}

}
