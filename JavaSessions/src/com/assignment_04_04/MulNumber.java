package com.assignment_04_04;

import java.util.Scanner;

public class MulNumber {
      void multiplication()
	{
	Scanner sc = new Scanner(System.in);
    System.out.println(" Enter Starting Point =");
    int s =sc.nextInt();
    System.out.println(" Enter Ending Point =");
    int e =sc.nextInt();
    System.out.println("*****Range*****");
    int mul=1;
    while(s<=e)
    {
    	System.out.println(s);
    	mul=mul*s;
    	s++;
    }
    System.out.println(" Multiplication = "+mul);
    sc.close();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulNumber obj = new MulNumber();
		obj.multiplication();
	}

}
