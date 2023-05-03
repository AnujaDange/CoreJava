package com.assignment_Pattern;

public class A_12_pattern {
	void print()
    {
    	int r=5;
    	for(int i=r ; i>=1 ; i--)
    	{
    		for(int j=1 ; j<=i ; j++)
    		{
    			System.out.print(" "+j);
    		}
    		
    		System.out.println();
    	}
    }
    void printRev()
    {
    	int r=1;
    	for(int i=5 ; i>=1 ; i--)
    	{
    		for(int j=5 ; j>=i ; j--)
    		{
    			System.out.print(" "+j);
    		}
    		
    		System.out.println();
    	}
    }
public static void main(String[] args) {
	// TODO Auto-generated method stub
	A_12_pattern obj = new A_12_pattern();
	obj.print();
	obj.printRev();
}

}