package com.assignment_29_03;

import java.util.Scanner;

public class A_02_Arithmetics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add,sub,mul,div,modulus;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two number = ");
		int a = input.nextInt();
		int b = input.nextInt();
		add = a + b;
		System.out.println("addition of two number = " + add);
		sub = a - b;
		System.out.println("substraction of two number = " + sub);
		mul = a * b;
		System.out.println("multiplication of two number = " + mul);
		div = a / b;
		System.out.println("division of two number = " + div);
		modulus = a % b;
		System.out.println("remainder of two number = " + modulus);
	}

}
