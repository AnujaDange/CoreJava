package com.method;

import java.util.Scanner;

public class Student {
	
        int id;
        String name,dept,email;
        double marks;
        
        void setData(int id,String name,String dept,String email,double marks)
        {
        	this.id=id;
        	this.name=name;
        	this.dept=dept;
        	this.email=email;
        	this.marks=marks;
        	
        }
        
         
       public String toString()
        {
        	return id+" "+name+"  "+dept+"  "+email+"  "+marks;
        }
        
       
}
