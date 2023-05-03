package com.assignment_Loop;

public class A_01_EvenNo {

	    void number()
	    {
	    	int a=121 , b=229;
	    	System.out.println(" Even numbers from 121 to 229");
	    	for(int i=a ; i<=b ; i++)
	    	{
	    		if(i%2==0)
	    		{	
	    		System.out.println(" "+i);
	    		}
	    	}
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_01_EvenNo obj=new A_01_EvenNo();
		obj.number();
	}

}
