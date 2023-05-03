package com.patternprint;

public class Pattern_1 {

	   void numberpattern()
	   {
		   int r=4;
		   for(int i=1 ; i<=r ; i++) // i=1      i=2       i=3      i=4     i=5  
		   {                       //    t		  t  		t        t       f
			   for(int j=1 ; j<=i ; j++) 
			   {
				   System.out.print(" *");
			   }
			   System.out.println();
		   }
	   }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_1 obj = new Pattern_1();
		obj.numberpattern();
	}
}
