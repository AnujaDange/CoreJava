package com.assignment_29_03;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter any character = ");
                char ch=sc.next().charAt(0);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
                {
                	System.out.println("Character is Vowel");  	
                }
                else
                {
                	System.out.println("Character is Consonant");  
                }
	}

}
