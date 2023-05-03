package com.sessionB;

import java.util.Scanner;

class Student {
	private int id;
	private String name;
	private String course;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourse() {
		return course;
	}
}
  public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of Student = ");
		int id = sc.nextInt();
		System.out.println("Enter name of Student =");
		String name = sc.next();
		System.out.println("Enter course of Student =");
		String course = sc.next();
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setCourse(course);
		System.out.println("Id = " + s.getId() + " \nName " + s.getName() + " \nCourse " + s.getCourse());

	}

}
