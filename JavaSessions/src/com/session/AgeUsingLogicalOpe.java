package com.session;

import java.util.Scanner;

public class AgeUsingLogicalOpe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age OF holder");
		int age = sc.nextInt();
		System.out.println("Enter city of customer = ");
		char city=sc.next().charAt(0);
		if(age>=18 || city=='p')
		{
			System.out.println("Able to create account");
		}
		else
		{
			System.out.println("Note able to create account");
		}
	}

}
