/* Pattern 
1 
12 
123 
1234 
12345 
1234 
123 
12 
1
*/



package com.assignment_Pattern;

public class A_02_Pattern {

	 void print()
	 {
		 int n=5;
		 for(int i=1 ; i<=n ; i++)
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
		 int r=4;
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
		A_02_Pattern obj = new A_02_Pattern();
		obj.print();
        obj.printRev();
	}

}
