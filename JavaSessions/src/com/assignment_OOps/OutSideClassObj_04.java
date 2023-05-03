
/* 4) Write a program for class and object : (main outside class) */
package com.assignment_OOps;

class Emp{  
	 int id;  
	 String name;  
	
	}  
	//Creating another class TestStudent1 which contains the main method  
	class OutSideClassObj_04{  
	 public static void main(String args[]){  
	  Emp s1=new Emp();  
	  System.out.println(s1.id);  
	  System.out.println(s1.name);  
	 }  
	}  