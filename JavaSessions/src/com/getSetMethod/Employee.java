package com.getSetMethod;

public class Employee {

	  private int id;
	  private String name,dept;
	  private double salary;
	  public void setId(int id)
	  {
		  this.id=id;
	  }
	  public int getId()   //return type
	  {
		  return id;
	  }
	  public void setName(String name)
	  {
		  this.name=name;
	  }
	  public String getName()   //return type
	  {
		  return name;
	  }
	  public void setDept(String dept)
	  {
		  this.dept=dept;
	  }
	  public String getDept()   //return type
	  {
		  return dept;
	  }
	  public void setSalary(double salary)
	  {
		  this.salary=salary;
	  }
	  public double getSalary()   //return type
	  {
		  return salary;
	  }
	  

}
