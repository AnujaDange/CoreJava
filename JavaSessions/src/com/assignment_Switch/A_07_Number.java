package com.assignment_Switch;

import java.util.Scanner;

public class A_07_Number {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
		     Scanner sc = new Scanner(System.in);
		     System.out.println("Enter any number = ");
		     int op = sc.nextInt();
		   		     switch(op)
		     {
		     case 1 :
		    	System.out.println("One");
		    	 break;
		     case 2 :
		    	 System.out.println("Two");
		    	 break;
		     case 3 :
		    	System.out.println("Three");
		    	 break;
		     case 4 :
		    	System.out.println("Four");
		    	 break;
		     case 5 :
		    	 System.out.println("Five");
		    	 break;
		    	 default :
		    		 System.out.println("Invalid choice !!!");
		    	 
		     }
		     
		}

	}


