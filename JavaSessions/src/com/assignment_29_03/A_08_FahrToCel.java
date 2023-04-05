package com.assignment_29_03;

import java.util.Scanner;

public class A_08_FahrToCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius=");
		double fahr = sc.reset().nextDouble();
		double cel = 0;
		cel = (fahr - 32)*1.8 ;
		System.out.println(fahr + " Fahrenhiet = " +cel + " Celsius ");

	}

}
