package com.looping;

public class AddDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             int num = 5342, add=0,r;
             while(num!=0)   // num=5432          num=543        num=54       num=5       num=0
             {               //   t                 t              t            t		    f
            	 r=num%10;     //5432%10=2        543%10=3		  54%10=4	  5%10=5
            	 add=add+r;     //0+2=2            2+3=5	       5+4=9      9+5=14
            	 num=num/10;    //5432/10=543      543/10=54	  54/10=5      5/10=0
             }
             System.out.println("Addition of Digits = "+add);
             
            	 
	}

}
