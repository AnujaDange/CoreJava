package com.assignment_29_03;

import java.util.Scanner;

public class A_11_SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter any Number = ");
         int no=sc.nextInt();
         int sqroot=(int) Math.sqrt(no);
         System.out.println("Square root of "+no+" = "+sqroot);
         sc.close();
	}

}
