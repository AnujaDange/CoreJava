package com.WrittenBasic_2;

public class StudentMethodsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMethods s1=new StudentMethods(101 ,"Riya","riya@gmail.com");
		StudentMethods s2=new StudentMethods(102,"Priti","priti@gmail.com");
		 
		int a=s1.hashCode();
		int b=s2.hashCode();
		System.out.println("Comparing obj s1 and s2= ");
		System.out.println(a);
		System.out.println(b);
		
	}

}

