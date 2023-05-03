package com.assignment_Pattern;

public class A_04_Pattern {
       void print()
       {
    	   int r=5;
    	   for(int i=1 ; i<=r ; i++)
    	   {
    		   for(int j=1 ; j<=i ; j++)
    		   {
    			   System.out.print(j);
    		   }
    		   for(int k=i-1 ; k>=1 ; k--)
    		   {
    			   System.out.print(k);
    		   }
    		   System.out.println();
    	   }
       }
       void btn()
       {
    	   int r=4;
    	   for(int i=r ; i>=1 ; i--)
    	   {
    		   for(int j=1 ; j<=i ; j++)
    		   {
    			   System.out.print(j);
    		   }
    		   for(int k=i-1 ; k>=1 ; k--)
    		   {
    			   System.out.print(k);
    		   }
    		   System.out.println();
    	   }

       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_04_Pattern obj = new A_04_Pattern();
	   obj.print();
	   obj.btn();
		
	}

}
