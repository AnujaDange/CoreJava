package com.demo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		int no=12895;
		int max=no%10;
	
		while(no!=0)
		{
			int rem=no%10;
			if(rem>max)
			{
				max=rem;
				
				
			}
			no=no/10;
			
		}
		System.out.println(max);
	}

}
