package com.looping;

import java.util.Scanner;

public class PrintEven {

	void printing()
	{
		 Scanner sc= new Scanner(System.in);
         System.out.println("Enter starting point =");
         int s = sc.nextInt();
         System.out.println("Enter ending point =");
         int e = sc.nextInt();
         System.out.println("**********Even no.**********");
         while(s<=e)
         {
        	 if(s%2==0)
        	 {
        		 System.out.println(s+" ");
        	 }
        	 s++;
        	 sc.close();
         }
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintEven obj = new PrintEven();
		obj.printing();
	}

}
