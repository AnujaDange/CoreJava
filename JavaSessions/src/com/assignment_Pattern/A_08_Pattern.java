
/*   */

package com.assignment_Pattern;

public class A_08_Pattern {

	   void print()
	   {
		   int n=6;
		   for(int i=1; i<=n ; i++)
		   {
			   for(int j=n-i ; j>=1 ; j--)
			   {
				   System.out.print(j+" ");
			   }
			   for(int k=1 ; k<=i ; k++)
			   {
				   System.out.print(k+" ");
			   }
			   
			   System.out.println();
		   }
	   }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_08_Pattern obj = new A_08_Pattern();
		obj.print();
	}

}
