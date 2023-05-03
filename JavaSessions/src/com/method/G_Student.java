package com.method;

public class G_Student {

	float percentage(float m1, float m2, float m3) {
		float per = (m1 + m2 + m3) / 3;
		System.out.println("Percentage = " + per);
		return per;
	}

	void grade(float per) {
		if (per >= 70) {
			System.out.println(" Distinction ");
		} else if (per >= 60) {
			System.out.println(" First class ");
		} else if (per >= 40) {
			System.out.println(" Pass ");
		} else
			System.out.println(" Fail ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Student 1 :");
		G_Student s1 = new G_Student();
		float p = s1.percentage(88, 78, 76);
		s1.grade(p);
		System.out.println();
		System.out.println(" Student 2 :");
		G_Student s2 = new G_Student();
		p = s2.percentage(78, 78, 65);
		s2.grade(p);

	}

}
