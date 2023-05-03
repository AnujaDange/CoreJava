
/* Suppose a number 24 .
Calculate the sum of digits of the number (2 + 4) = 6 .
Check whether the number entered by user is completely divisible by sum of its digits or not.
*/

package com.assignment_30_April;

public class DigitSum {
	void calDigitSum()
	{
		int no=24;
		int n=no;
		int sum=0,rem=0;
		while(no!=0)   //    24      2        0
		{   //               t       t        f
			rem=no%10;     // 4        2        
			sum=sum+rem;   // 0+4=4   4+2=6
			no=no/10;     // 2        0
		}
		System.out.println("Sum = "+sum);
		if(n%sum==0)
		{
			System.out.println(n+" completely divisible by sum of its digits ");
		}
		else 
		{
			System.out.println(n+" not divisible by sum of its digits ");
		}
	}
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitSum d = new DigitSum();
		d.calDigitSum();		
	}

}
