package com.method;

import java.util.Scanner;

public class Employee {

	int id;
	String name, depart;
	double salary;
	/*
	 * void setdata() {
	 * System.out.println("Enter employee id ,name,department,salary = "); Scanner
	 * sc = new Scanner(System.in); id=sc.nextInt(); name=sc.next(); sc.nextInt();
	 * depart=sc.next(); salary=sc.nextDouble(); }
	 */

	void setdata_argu(int i, String n, String d, double s) {
		id = i;
		name = n;
		depart = d;
		salary = s;
	}

	void getdata() {
		System.out.println(id + " " + name + " " + depart + " " + salary);
	}
}
