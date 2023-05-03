package com.method;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 
	/*	Student s1 = new Student();
		s1.setData(12,"Gayatri","  BCS","gayatri12@gmail.com",88.20);
		Student s2 = new Student();
		s2.setData(21,"Vaishnavi","MCA","vaishnavi21@gmail.com",85.87);
		System.out.println(s1);
		System.out.println(s2);
		*/
		
		// gives user entered value
	        	Scanner sc = new Scanner(System.in);
	        	System.out.println("Enter id ,name,department,email and marks = ");
	        	int id=sc.nextInt();
	        	sc.nextLine();
	        	String name=sc.nextLine();
	        	String dept=sc.nextLine();
	        	String email=sc.nextLine();
	        	double marks=sc.nextDouble();
		Student s1 = new Student();
		s1.setData( id, name, dept, email, marks);
		System.out.println(s1);
		
		
	}

}
