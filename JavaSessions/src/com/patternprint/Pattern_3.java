package com.patternprint;

public class Pattern_3 {
	  void charpattern()
	  {
		  char r='d';
		  for(char i='a' ; i<='d' ; i++)
		  {
			  for(char j='a' ; j<=i ; j++)
			  {
				  System.out.print(i);  
			  }
		
			  System.out.println(); 
		  }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_3 obj = new Pattern_3();
		obj.charpattern();
	}

}
