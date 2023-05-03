package com.assignment_Pattern;

public class A_14_pattern {
      void print()
      {
    	  int r=5;
    	  for(int i=1 ; i<=r ; i++)
    	  {
    		  for(int j=r-1 ; j>=1 ; j--)
    		  {
    			  System.out.print(" ");
    		  }
    		  for(int k=1 ; k<=i ; k++)
    		  {
    			  System.out.print(" *");
    		  }
    		  System.out.println();
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_14_pattern obj = new A_14_pattern();
		obj.print();
	}

}
  