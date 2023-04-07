package com.looping;

import java.util.Scanner;

public class RevNumber {
     
	 
	  void Reverse()
	  {
		  char ch;
		  do{
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a Number = ");
		  int num=sc.nextInt();
		  int rev=0,rem;
		  
		while(num!=0)
		  {
			  rem=num%10;
			  rev=(rev*10)+rem;
			  num=num/10;
		  }
		System.out.println("Reverse Number = "+rev);
		System.out.println("If you want to continue!! Enter y/n");
	    ch = sc.next().charAt(0);
	  }while(ch=='y' || ch=='Y');
	  }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RevNumber obj = new RevNumber();
		obj.Reverse();
	}

}
