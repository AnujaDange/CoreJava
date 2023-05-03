package com.assignment_Pattern;

public class A_07_Pattern {
	void print1()
	{
       int n=7;
       for(int i=1 ; i<=n ; i++)  // i=1  i=2 
       {                         //   t
    	   for(int j=n-i ; j>=1 ; j--) //j=3 j=2 j=1   j=2 j=1
    	   {                          //  t   t   t     t   t
    		   System.out.print(" ");
    	   }
    	   for(int j=1 ;j<=i ; j++)//   j=1  j=1 j=2
    	   {                          // t    t   t
    		   System.out.print(i+" "); // j=1   j=1,2
    	   }
    	   System.out.println();
       }
	}
	 void print2()
	  {
			int n=7;
			for (int i=1; i<=n; i++)// i=1  i=2  i=3  i=4  i=5
	        {//                         t    t    t    t    f
	 
	            // inner loop to handle number spaces
	            for (int j=n-i; j>=1; j--)//  j=3   j=2   j=1  --- j=2  j=1  ---j=1 ---j=0
	            {//                            t     t     t        t    t       t      f
	            	
	                // printing spaces
	                System.out.print(" ");//  space upto 3c
	            } 
	           
	            //  inner loop to handle number of columns
	            for (int j=1; j<=i; j++ )// j=1 --- j=1  j=2 --- j=1  j=2  j=3 --- j=1  j=2  j=3  j=4
	            { //                         t       t    t       t	   t    t       t    t    t    t
	                // printing stars
	                System.out.print(j+" ");
	            }
	  
	            // ending line after each row
	            System.out.println();
	        }
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A_07_Pattern obj = new A_07_Pattern();
     	obj.print1();
     	System.out.println();
    	obj.print2();
	}
	
}
