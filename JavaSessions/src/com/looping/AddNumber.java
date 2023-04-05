package com.looping;

import java.util.Scanner;

public class AddNumber {
          void addnum()
          {
        	     Scanner sc = new Scanner(System.in);
        	     System.out.println("Enter Starting point = ");
        	     int s = sc.nextInt();
        	     System.out.println("Enter Ending point = ");
        	     int e = sc.nextInt();
        	     int add=0;
        	     while(s<=e)
        	     {
        	     	add=add+s;
        	     	s++;
        	     }
        	     System.out.println("Addition = "+add);
        	     sc.close();
          }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddNumber obj = new AddNumber();
		obj.addnum();
	}

}
