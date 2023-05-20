package com.assignment_Switch;

import java.util.Scanner;

public class A_10_GreatestofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number =");
		n1=sc.nextInt();
		n2=sc.nextInt();
		int res = n1>n2?1:0;
		switch (res)
		{
			case 0:				
				res = n1==n2?1:0;
				switch(res)
				{
					case 0:						
						System.out.printf("Maximum Number is "+n2);
						break;					
					case 1:						
						System.out.printf("Both are Equals");
						break;
				}
				break;
 
			case 1:
				System.out.printf("Maximum Number is "+n1);
				break;
		}

	}

}
