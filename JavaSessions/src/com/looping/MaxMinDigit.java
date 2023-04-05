package com.looping;

public class MaxMinDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int num=15432 ,min=num%10 ,max=num%10,r;
            //max=2
            //min=2
            while(num!=0)           // num=15432    num=1543     num=154     num=15    num=1
            {                   //         t           t            t           t        t
            	r=num%10;        //    r=2             3            4           5        1
            	if(r>max)         //    f              t             t          t        f
            	{             
            		max=r;        //                    max=3      max=4     max=5
            	}
            	if(r<min)        //    f                f           f           f        t
            	{
            		min=r;         //                                                   min=1
            	}
            	num=num/10;       //1543              154          15           1        0
            }
            System.out.println("Maximun Digit = "+max);
            System.out.println("Minimum Digit = "+min);
	}

}
