package com.looping;

import java.util.Scanner;

public class ForLooping {

	
	   void printForward()
	   {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter number upto which you want to print forward =");
		   int num =sc.nextInt();
		   for(int i=1 ; i<=num ; i++)
		   {
			   System.out.print(i);
		   }
		   System.out.println("Done");
	   }
	   void printReverse()
	   {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter number upto which you want to print Reverse ");
		   int num=sc.nextInt();
		   for(int i=num ;i>=1 ; i--)
		   {
			   System.out.print(i);
		   }
		   System.out.println("Done");
	   }
	   void factorial()
	   {
		   int fact=1;
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter number =");
		   int num=sc.nextInt();
		   for(int i=1 ;i<=num ; i++)
		   {
			   fact=fact*i;
		   }
		   System.out.println("Factorial of "+num+" = "+fact);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1. Display Forward ");
		System.out.println(" 2. Display Reverse ");
		System.out.println(" 3. Display factorial ");
		System.out.println("Enter Your Choice = ");
		int op = sc.nextInt();
		ForLooping obj =new ForLooping();
		switch(op)
		{
		case 1 : 
		obj.printForward();
		break;
		case 2 :
		obj.printReverse();
		break;
		case 3 :
		obj.factorial();
		break;
		default :
			System.out.println("Invalid choice");
		}
		System.out.println("Do you want to continue ? press y/n ");
		ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
	}

}
