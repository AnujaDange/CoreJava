package com.getSetMethod;

public class Student {

	private int id;
	  private String name,dept;
	  private double marks;
	  String email;
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
	  public void setMarks(double marks)
	  {
		  this.marks=marks;
	  }
	  public double getMarks()   //return type
	  {
		  return marks;
	  }
	  public void setEmail(String email)
	  {
		  this.email=email;
	  }
	  public String getEmail()
	  {
		  return email;
	  }
	  

}
