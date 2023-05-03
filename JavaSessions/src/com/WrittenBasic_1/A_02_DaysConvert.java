  // Write a Java program to convert days into years, weeks and days.
package com.WrittenBasic_1;

import java.util.Scanner;

public class A_02_DaysConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter number of Days = ");
          int no = sc.nextInt();
          int year ,month,days,week;
          year = no/365;
          days=no%365;
          System.out.println(year+" year");
          
      //   month= no/12;
          days=no%12;
     //     System.out.println(month+" month");  
          
          week= no/7;
         days=no%7;
          System.out.println(days+" days");
          System.out.println(week);
          
	}

}
