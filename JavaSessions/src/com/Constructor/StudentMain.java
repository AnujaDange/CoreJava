package com.Constructor;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student.universityinfo();
         System.out.println(Student.university);
         Student s1=new Student(101," Ruhi  ","BCS");
         Student s2=new Student(102," Priti ","Bsc");
         Student s3=new Student(103," Abhi  ","MBA");
         Student s4=new Student(104," Sumit ","MCA");
         System.out.println();
         System.out.println(s1);
         System.out.println(s2);
         System.out.println(s3);
         System.out.println(s4);
	}

}
