package com.assignment_29_03;

import java.util.Scanner;

public class A_10_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Base and Exponent");
         int no1 = sc.nextInt();
         int no2 = sc.nextInt();
        
         int power=(int)Math.pow(no1,no2);
         System.out.println(no1+"^"+no2+"=" +power);
         
	}

}
