package com.method;

public  class Faculty {

	   int id;
	   String name,subject;
	   double salary;
	   void setData(int id,String name,String subject,double salary)
	   {
		   this.id=id;
		   this.name=name;
		   this.subject=subject;
		   this.salary=salary;
	   }
	  public String toString()
	  {
		  return id+" "+name+" "+subject+" "+salary;
	  }

}
