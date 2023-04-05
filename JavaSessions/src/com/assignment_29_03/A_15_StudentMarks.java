package com.assignment_29_03;

import java.util.Scanner;

public class A_15_StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         System.out.println("Enter marks for five subject =");
         int s1=sc.nextInt();
         int s2=sc.nextInt();
         int s3=sc.nextInt();
         int s4=sc.nextInt();
         int s5=sc.nextInt();
         int total;
         double percentage;
         total=s1+s2+s3+s4+s5;
         System.out.println("Total = "+total);
         percentage=(total*100)/500;
         System.out.println("Percentage = "+percentage);
         
      
	}

}
