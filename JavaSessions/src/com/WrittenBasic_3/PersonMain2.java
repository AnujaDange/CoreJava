
//2.	Create class Person which has attributes (name, gender, age, Address). 
//Address is class which has attributes (city, state, country). Display Persons data
//Note. Containment using constructor and getter/setter

package com.WrittenBasic_3;

import java.util.Scanner;

public class PersonMain2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Address2 a = new Address2("Karad", "Maharashtra", "India");

		System.out.println();
		System.out.println("Enter name,gender,age,address");
		String name = sc.next();
		String gender = sc.next();
		int age = sc.nextInt();
		String address = sc.next();
		Person2 p = new Person2(name, gender, age, a);
		p.setName(name);
		p.setGender(gender);
		p.setAge(age);
		p.setAddress(a);
		System.out.println("Persons Data ");
		System.out.println(a.getCity() + " " + a.getState() + " " + a.getCountry());
		System.out.println(p.getName() + " " + p.getGender() + " " + p.getAge() + " " + p.getAddress());

	}

}
