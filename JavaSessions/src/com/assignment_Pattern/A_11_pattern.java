package com.assignment_Pattern;

public class A_11_pattern {
        void print()
        {
        	char r='F';
        	for(char i=r ; i>='A' ; i--)
        	{
        		for(char j='A' ; j<=i ; j++)
        		{
        			System.out.print(" "+j);
        		}
        		
        		System.out.println();
        	}
        }
        void printRev()
        {
        	char r='F';
        	for(char i='A' ; i<=r ; i++)
        	{
        		for(char j='A' ; j<=i ; j++)
        		{
        			System.out.print(" "+j);
        		}
        		
        		System.out.println();
        	}
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_11_pattern obj = new A_11_pattern();
		obj.print();
		obj.printRev();
	}

}
