package com.getSetMethod;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("1. Student");
		System.out.println("Enter id ,name,department,marks,email ");
		int id = sc.nextInt();
		String name = sc.next();
		String dept = sc.next();
		double marks = sc.nextDouble();
		String email = sc.next();
		Student s1 = new Student();
		s1.setId(id);
		s1.setName(name);
		s1.setDept(dept);
		s1.setMarks(marks);
		s1.setEmail(email);
		System.out.println();
			System.out.println();
		System.out.println("2. Student");
		System.out.println("Enter id ,name,department,marks,email ");
		 id = sc.nextInt();
		 name = sc.next();
		 dept = sc.next();
		 marks = sc.nextDouble();
		 email = sc.next();
		Student s2 = new Student();
		s2.setId(id);
		s2.setName(name);
		s2.setDept(dept);
		s2.setMarks(marks);
		s2.setEmail(email);
		System.out.println();
		
				System.out.println();
		System.out.println("3. Student");
		System.out.println("Enter id ,name,department,marks,email ");
		id = sc.nextInt();
		 name = sc.next();
		 dept = sc.next();
		 marks = sc.nextDouble();
		 email = sc.next();
		Student s3 = new Student();
		s3.setId(id);
		s3.setName(name);
		s3.setDept(dept);
		s3.setMarks(marks);
		s3.setEmail(email);
		System.out.println();
		System.out.println(s1.getId() + " " + s1.getName() + " " + s1.getDept() + " " + s1.getMarks() + " " + s1.getEmail());
		
		System.out.println(s2.getId() + " " + s2.getName() + " " + s2.getDept() + " " + s2.getMarks() + " " + s2.getEmail());
		
		System.out.println(s3.getId() + " " + s3.getName() + " " + s3.getDept() + " " + s3.getMarks() + " " + s3.getEmail());

	}

}
