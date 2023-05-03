package com.assignment_Loop;

public class A_02_Odd_No {

	void number()
	{
		int a=521 ,b=229; 
		System.out.println("Odd numbers from 521 to 229");
		for(int i=a; i>=b ; i--)
		{
			if(i%2!=0)
			{
				System.out.println(" "+i);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_02_Odd_No obj = new A_02_Odd_No();
		obj.number();
	}

}
