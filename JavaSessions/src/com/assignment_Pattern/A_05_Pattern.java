package com.assignment_Pattern;

public class A_05_Pattern {
            void print()
            {
            	int r=5;
            	System.out.println("*");
            	for(int i=1 ; i<=r ; i++)
            	{
            		System.out.print("*");
            		for(int j=1 ; j<=i ; j++)
            		{
            			System.out.print(j);
            		}
            		for(int k=i-1 ; k>=1 ; k--)
            		{
            			System.out.print(k);
            		}
            	System.out.println("*");
            	}
            }
            void printRev()
            {
            	int r=4;
            	
            	for(int i=r ; i>=1 ; i--)
            	{
            		System.out.print("*");
            		for(int j=1 ; j<=i ; j++)
            		{
            			System.out.print(""+j);
            		}
            		for(int k=i-1 ; k>=1 ; k--)
            		{
            			System.out.print(k);
            		}
            		System.out.println("*");
            	}
            	System.out.print("*");
            }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_05_Pattern obj=new A_05_Pattern();
        obj.print();
        obj.printRev();
	}

}
