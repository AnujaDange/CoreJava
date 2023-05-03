 //	WAP to print odd numbers from 521 to 229 using while loop. 
package com.WrittenBasic_1;

public class A_03_OddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a=521 , b=229;
      System.out.println("Odd Numbers from 521 to 229 ");
      while(a>=b)
      {
    	  if(a%2!=0)
    	  {
    		  System.out.println("    "+a);
    	  }
    	  a--;
      }
	}

}
