package com.session;

import java.util.Scanner;

public class AccountHolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of Account Holder = ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("You are able to create account");
		} else {
			System.out.println("You are not able to create account");
		}

	}
}
