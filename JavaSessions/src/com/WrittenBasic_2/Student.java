//    4.create student class assign marks and calculate the percentage and print the result 1st class,2nd class etc.
package com.WrittenBasic_2;

public class Student {

	int m1, m2, m3;
	int mark;
	float per;
	float marks(int m1, int m2, int m3) {
		per = (m1 + m2 + m3) / 3;
		System.out.println("Percentage = " + per);
		return per;
	}

	void result(float per) {
		if (per >= 85) {
			System.out.println("first class");
		} else if (per >= 70) {
			System.out.println("second class");
		} else if (per >= 60) {
			System.out.println("third class");
		} else if (per >= 35) {
			System.out.println("pass");
		} else {
			System.out.println("fail ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1. Student");
		Student s1 = new Student();
		float m = s1.marks(87, 90, 78);
		s1.result(m);
		/*
		 * System.out.println(); System.out.println("2. Student"); Student s2=new
		 * Student(); m=s2.marks(70,80,88); s2.result(m);
		 */
	}

}
