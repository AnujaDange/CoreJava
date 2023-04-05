package com.livedemo;

import java.util.Scanner;

public class StudPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Percentage = ");
		double per = sc.nextDouble();
		if (per >= 70 && per <= 100)
		{
			System.out.println("Distinction...");
		} 
		else if (per >= 60) 
		{
			System.out.println("First class...");
		} 
		else if (per >= 50)
		{
             System.out.println("Second class...");
		}
		else if (per > 35) 
		{
			System.out.println("Pass...");
		} 
		else 
		{
             System.out.println("Fail...");
		}
	}

}
