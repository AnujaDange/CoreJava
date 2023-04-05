package com.livedemo;

import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number = ");
		int no = sc.nextInt();
		if(no>0)
		{
			if (no % 2 == 0)
			{
				System.out.println("Number is Even");
			}
			else 
			{
				System.out.println("Number is Odd");
			}
			
		}
		else
		{
			System.out.println("Number is negative...........plz enter posivite number");
		}
		
	}

}
