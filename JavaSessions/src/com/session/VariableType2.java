package com.session;

import java.util.Scanner;

public class VariableType2 {
	
							 
	
	Scanner sc= new Scanner(System.in);
	static int a=10;						 //  *Static variable
	String name;                       			  //  *instance variable 
	System.out.println("Enter name = ");
	name=sc.nextInt();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableType2 obj = new VariableType2();
		 char ch = 'A';								//   *local variable
		 System.out.println(ch+" is vowel ");       //   call using variable name 
		 System.out.println("Name is "+obj.name);   //  call using object
		 System.out.println("Value of "+VariableType2.a);	        //  call using Class name 

	}

}
