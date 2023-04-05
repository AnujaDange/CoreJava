package com.assignment_29_03;

import java.util.Scanner;

public class A_07_tempratureC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius=");
		double cel = sc.reset().nextDouble();
		double fahr;
		fahr = (1.8 * cel) + 32;
		System.out.println(cel + " Celsius = " + fahr + "Fahrenhiet");
		
	}

}
