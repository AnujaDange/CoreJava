package com.looping;

import java.util.Scanner;

public class PrintChar {

	   void character()
	   {
		   Scanner sc = new Scanner(System.in);
           System.out.println("Enter Starting point character = ");
           char s = sc.next().charAt(0);
           System.out.println("Enter Ending point character = ");
           char e = sc.next().charAt(0);
           System.out.println("*******Alphabets********");
           while(s<=e)
           {
        	   System.out.println(s);
        	   s++;
           }
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintChar obj = new PrintChar();
		obj.character();
           
	}

}
