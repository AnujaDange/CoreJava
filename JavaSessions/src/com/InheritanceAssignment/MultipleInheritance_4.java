
/* 4. Write  programs for multilevel inheritance*/

package com.InheritanceAssignment;

   class A 
   {
	   void a_method()
	   {
	   System.out.println("This is Parent class");
	   }
   }
   class B extends A
   {
	   void b_method()
	   {
	   System.out.println("This is Intermediate class");
	   }
   }
   class C extends B
   {
	   void c_method()
	   {
		   System.out.println("This is Child class");
	   }
	  
   }
public class MultipleInheritance_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj = new C();
		obj.a_method();
		obj.b_method();
		obj.c_method();		
	}

}
