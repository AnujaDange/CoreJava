
/*6) Write a program to demonstrate anonymous object.*/
/*Anonymous simply means nameless. An object which has no reference is known as an anonymous object.
It can be used at the time of object creation only.*/
package com.assignment_OOps;
  // Object without having any name but having reference
public class AnonymousObj_06 {

	void fact(int  n){  
		  int fact=1;  
		  for(int i=1;i<=n;i++){  
		   fact=fact*i;  
		  }  
		 System.out.println("factorial = "+fact);  
		}
	void show()
	{
		System.out.println("Shows Anonymous Object");
	}
		public static void main(String args[]){  
			new AnonymousObj_06().show();
		new AnonymousObj_06().fact(5);//calling method with anonymous object  
		}  

}
