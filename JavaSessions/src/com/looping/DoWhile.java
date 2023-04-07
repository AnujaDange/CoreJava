package com.looping;

public class DoWhile {

	        void whileDemo()
	        {
	        	int s=7;
	        	while(s<=5)
	        	{
	        		System.out.print(s);
	        		s++;
	        	}
	        	System.out.println("Done");
	        }
	        void doWhileDemo()
	        {
	        	int s=7;
	        	do {
	        		System.out.print(s);
	        		s++;
	        	}while(s<=5);
	        	System.out.println("Done");
	        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		DoWhile obj = new DoWhile();
		obj.whileDemo();
		obj.doWhileDemo();
	}

}
