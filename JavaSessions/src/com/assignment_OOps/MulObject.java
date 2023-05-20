
/*7) Write a program to create multiple objects of one type only.*/

package com.assignment_OOps;

public class MulObject {
String name;
	int roll;
    void set()
    {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("Enter name and roll no. of Student = ");
    	 name=sc.next();
         roll=sc.nextInt();
    }
    void get()
    {
    	System.out.println("Name = "+name);
    	System.out.println("Roll no. ="+roll);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulObject s = new MulObject();
		s.set();
		s.get();
	}
}
