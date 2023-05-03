package com.getSetMethod;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setId(101);
		e1.setName("Gayatri");
		e1.setDept("HR");
		e1.setSalary(70000);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id,name,department,salary");
		int id=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		double salary=sc.nextDouble(); 
		
		Employee e2=new Employee();
		e2.setId(id);
		e2.setName(name);
		e2.setDept(dept);
		e2.setSalary(salary);
		System.out.println();
		System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getDept()+" "+e1.getSalary());
		System.out.println(e2.getId()+" "+e2.getName()+" "+e2.getDept()+" "+e2.getSalary());
		
		
	}

}
