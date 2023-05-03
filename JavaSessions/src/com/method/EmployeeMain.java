package com.method;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Employee e1 = new Employee();
		e1.setdata();
		
		
		/*Employee e2 = new Employee();
		e2.setdata();
		e2.getdata(); */
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter id ,name ,salary,");
		int i = sc.nextInt();
		String n = sc.next(); 
		sc.nextInt();
		String d = sc.next();
		double s = sc.nextDouble(); 
		Employee e1 = new Employee();
		//e1.setdata_argu(1,"riya","HR",70000);
		e1.getdata(); 
	} 

}
