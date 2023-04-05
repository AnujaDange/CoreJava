package com.assignment_29_03;

import java.util.Scanner;

public class A_06_CentiToMeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length in centimeter =");
		double lcm = sc.nextInt();
		double lm, lkm;
		lm = lcm / 100;
		// 1m=100cm and 1cm=0.01m
		System.out.println("Converting " + lcm + " centimeter to meter = " + lm);
		lkm = lcm / 100000;
		// 1cm=0.00001
		System.out.println("Converting " + lcm + " centimeter to kilometer = " + lkm);

	}

}
