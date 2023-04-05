package com.livedemo;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter Two Numbers = ");
           int a=sc.nextInt();
           int b=sc.nextInt();
           System.out.println("*******Operations********");
           System.out.println("1. Addition");
           System.out.println("2. Substraction");
           System.out.println("3. Multiplication \n4. Division \n5. Square ");
           System.out.println("************************");
           System.out.println("Enter Your Choice for the operation");
           int op=sc.nextInt();
           switch(op)
           {
           case 1: System.out.println("Addition = "+(a+b));
           break;
           case 2: System.out.println("Substraction = "+(a-b));
           break;
           case 3: System.out.println("Multiplication = "+(a*b));
           break;
           case 4: System.out.println("Division = "+(a/b));
           break;
           case 5: System.out.println("Square of "+a+ "="+(a*a)+" Square of "+b+"="+(b*b));
           break;
           default:
        	   System.out.println("Plz enter valid choice !!!!");
           
           
           }
	}

}
