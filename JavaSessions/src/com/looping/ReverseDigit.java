package com.looping;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num=5432,r,rev=0,add=0;
           while(num!=0)    //  num=5432 
           {                //   t      
        	   r=num%10;    //  r=2
        	 rev=num+r;    //543
        	    num=num/10;
           }
		System.out.println(add);
		
		
	}

}
