package com.looping;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter any Number = ");
                  int no = sc.nextInt();
                  int i=1,num=0;
                  while(i<=no)
                  if(no%i==0)    //7%1=
                  {
                	 System.out.println(i); 
                	 num=i;
                  }
                  i++; 
                  if(i<=2)
                  {
                	  System.out.println(i);
                  }
	}

}
