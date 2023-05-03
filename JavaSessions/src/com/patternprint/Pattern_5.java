package com.patternprint;

public class Pattern_5 {

	  void charpattern()
	  {
		  char r='d';
		  for(char i='a' ; i<=r ; i++)
		  {
			  for(char j='a' ; j<=i ; j++)
			  {
				  System.out.print(j);  
			  }
		
			  System.out.println();
		  }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_5 obj = new Pattern_5();
		obj.charpattern();
	}


}
