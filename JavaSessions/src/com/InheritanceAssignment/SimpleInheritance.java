package com.InheritanceAssignment;
  
   class Person
   {
	   int id;
	   String name;
	   String gender;
	   Person()
	   {
		   System.out.println("Default constructor ");
	   }
   }
   class Employee extends Person
   {
	   float salary;
   }
public class SimpleInheritance {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
	
				
	}

}
