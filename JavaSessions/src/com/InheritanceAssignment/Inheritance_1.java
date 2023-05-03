// 1. Create a class with display() method that prints "This is parent class" and its
//subclass with another view() method that prints "This is child class". Now,
//create an object for each of the class and call
//1 - method of parent class by object of parent class
//2 - method of child class by object of child class
//3 - method of parent class by object of child class

package com.InheritanceAssignment;

  class Parent
 {
	  void display()
	  {
		  System.out.println("This is parent class");
	  } 
 }
  class Child extends Parent
  {
	   void view()
	 	  {
	 		  System.out.println("This is child class");
	 	  } 
  }
public class Inheritance_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.display();
		Child c = new Child();
		c.view();
		c.display();
	}

}
