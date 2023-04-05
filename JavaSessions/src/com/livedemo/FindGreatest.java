package com.livedemo;

import java.util.Scanner;

public class FindGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter Four Numbers");
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(a>b && a>c && a>d)
            {
            	System.out.println("Greater Number is "+a);
            }
            else if(b>a && b>c && b>d)
            {
            	System.out.println("Greater Number is "+b);
            }
            else if(c>a && c>b && c>d)
            {
            	System.out.println("Greater Number is "+c);
            }
            else
            {
            	System.out.println("Greater Number is "+d);
            }     
	}

}
