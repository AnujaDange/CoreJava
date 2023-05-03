package com.patternprint;

public class Pattern_4 {

	  void numberpattern()
	  {
		  int r=4;
		  for(int i=1 ; i<=r ; i++)
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
		Pattern_4 obj = new Pattern_4(); 
		obj.numberpattern();
	}


}
