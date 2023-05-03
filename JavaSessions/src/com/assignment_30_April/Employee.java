
/*3)Create one class Employee (id , name, salary) with private access modifier
and create getter and setter and display details.
*/

package com.assignment_30_April;

import java.util.Scanner;

public class Employee {
   private int id;
   private String name;
    private float salary;
      public void setId(int id)
      {
    	  this.id=id;
      }
      public int getId()
      {
    	  return id;
      }
      public void setName(String name)
      {
    	  this.name=name;
      }
      public String getName()
      {
    	  return name;
      }
      public void setSalary(float salary)
      {
  		this.salary = salary;
  	  }
      public float getSalary() 
      {
  		return salary;
   	  }
    
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id,name,salary");
		int id=sc.nextInt();
		String name=sc.next();
		float salary=sc.nextFloat();
		System.out.println();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		
	}
	
	

}
