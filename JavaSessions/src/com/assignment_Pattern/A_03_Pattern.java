package com.assignment_Pattern;

public class A_03_Pattern {

	   void print()
	   {
		   int r=7;
		   for(int i=1 ; i<=r ; i++)
		   {
			   for(int j=1 ; j<=i ; j++)
			   {
				   System.out.print(j);
			   }
			   System.out.println();
		   }
	   }
	   void printRev()
	   {
		   int r=6 ; 
		   for(int i=r ; i>=1 ; i--)
		   {
			   for(int j=1 ; j<=i ; j++)
			   {
				   System.out.print(j);
			   }
			   System.out.println();
		   }
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_03_Pattern obj = new A_03_Pattern();
		obj.print();
		obj.printRev();
	}

}
