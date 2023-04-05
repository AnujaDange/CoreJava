package com.looping;

import java.util.Scanner;

public class PrintNumber {
	
	void printing()
	{
		 Scanner sc= new Scanner(System.in);
         System.out.println("Enter starting point =");
         int s = sc.nextInt();
         System.out.println("Enter ending point =");
         int e = sc.nextInt();
         System.out.println("**************************");
         while(s<=e)
         {
        	 System.out.println(s+" ");
        	 s++;
         }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		PrintNumber obj = new PrintNumber();
		obj.printing();
	}

}
