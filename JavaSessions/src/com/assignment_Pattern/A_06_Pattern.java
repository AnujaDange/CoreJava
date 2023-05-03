package com.assignment_Pattern;

public class A_06_Pattern {
	/*
	 * void print() { int r=4; for(int i=1 ; i<=r ; i++) { for(int j=r-1 ; j>=1 ;
	 * j--) { System.out.print(" "); } for(int k=1 ; k<=i ; k++) {
	 * System.out.print("* "); } System.out.println(); }
	 * 
	 * }
	 */
         void pattern() {
     		int n = 7;
     		for (int i = 1; i <= n; i++)// i=1 i=2 i=3 i=4 i=5
     		{// t t t t f

     			// inner loop to handle number spaces
     			for (int j = n - i; j >= 1; j--)// j=3 j=2 j=1 --- j=2 j=1 ---j=1 ---j=0
     			{// t t t t t t f

     				// printing spaces
     				System.out.print(" ");// space upto 3c
     			}

     			// inner loop to handle number of columns
     			for (int k = 1; k <= i; k++)// j=1 --- j=1 j=2 --- j=1 j=2 j=3 --- j=1 j=2 j=3 j=4
     			{ // t t t t t t t t t t
     				// printing stars
     				System.out.print(k+" ");
     			}

     			// ending line after each row
     			System.out.println();
     		}
     	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_06_Pattern obj = new A_06_Pattern();
		//obj.print();
		obj.pattern();
	}

}
