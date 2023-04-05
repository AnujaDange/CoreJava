package com.livedemo;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter any number = ");
           int no=sc.nextInt();
           if(no>0)
           {
        	   System.out.println("Number is Positive");
           }
           else
           {
        	   System.out.println("Number is Negative");
           }
	}

}
