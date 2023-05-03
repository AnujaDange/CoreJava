package com.assignment_Pattern;

public class A_13_pattern {
	        void print()
	        {
	        	int r=5; 
	        	for(int i=1 ; i<=r ; i++)
	        	{
	        		for(int j=1 ; j<=i ; j++)
	        		{
	        			System.out.print("* ");
	        		}
	        		System.out.println();
	        	}
	        }
			void printRev()
			{
				int r=5;
				for(int i=r ; i>=1 ; i--)
				{
					for(int j=1 ; j<=i ; j++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_13_pattern obj = new A_13_pattern();
		obj.print();
		obj.printRev();
	}

}
