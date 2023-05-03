package com.InheritanceAssignment;

import java.util.Scanner;

class Person_1 {
	String city;
	String name;
	String gender;

	Person_1(String city, String name, String gender) {
		this.city = city;
		this.name = name;
		this.gender = gender;
	}

	void display() {
		System.out.println(city + " " + name + " " + gender);
	}
}

class Employee_1 extends Person_1 {
	Employee_1(String city, String name, String gender ) {
		super(city,name,gender);
		//super("Karad", "Anuja", "Female");
	}
	void display()
	{
      super.display();
	}

}

public class SuperParameterConstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name city gender =");
		String name=sc.next();
		String city=sc.next();
		String gender=sc.next();
		Employee_1 e = new Employee_1(city,name,gender);
		e.display();
	}

}
