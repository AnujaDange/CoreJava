package com.assignment_Switch;

import java.util.Scanner;

public class A_04_Calculator {

	public static void main(String[] args) {
		char ans;
		// TODO Auto-generated method stub
		do {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("Enter your chaoice = ");
        int ch = sc.nextInt();
        System.out.println("Enter Two number =");
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch(ch)
        {
        case 1 :
        	System.out.println("Addition="+(a+b));
        	break;
        case 2 :
        	System.out.println("Substraction="+(a-b));
        	break;
        case 3 :
        	System.out.println("Multiplication="+(a*b));
        	break;
        case 4 :
        	System.out.println("Division="+(a/b));
        	break;
        case 5 :
        	System.out.println("Modulus="+(a%b));
        	break;
        	default:
        		System.out.println("Invalid Choice !!!");
        }
        System.out.println("Do you want to calculate Press y/n");
         ans=sc.next().charAt(0);
		}while(ans=='Y' || ans=='y');
	}

}
