package com.assignment_Switch;

import java.util.Scanner;

public class A_06_InputError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Integer Input= ");
		int no=sc.nextInt();
		switch(no)
		{
		case 1: 
		case 2: 
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
			System.out.println("day of week");
			break;
			default :
				 System.out.println("error,day does not exist");
		}
		
		/*
		 * if(no>=1 && no<=7)
		 * {
		 *    System.out.println("day of week");
		 * }
		 * else
		 * {
		 *    System.out.println("error,day does not exist");
		 * }
		 * */
		
		
		
		
		
		
		
	}

}
