/*1.	WAP to have Department class created with id, name . 
Student class has roll, name and Department object should have id and name.
Assign and print individual values in main method*/


package com.WrittenBasic_3;

public class DepartmentMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department1 obj = new Department1();
			obj.dept(101,"Gayatri");
		Student1 st = new Student1();
		st.stud(9512,"Anuja");
		   System.out.println(st);
           System.out.println(obj);
	}

}
