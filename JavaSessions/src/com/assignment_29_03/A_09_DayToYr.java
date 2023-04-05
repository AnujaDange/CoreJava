package com.assignment_29_03;

import java.util.Scanner;

public class A_09_DayToYr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
          
          int no, year, week, day;
          Scanner s = new Scanner(System.in);
          System.out.print("Enter days:");
          no= s.nextInt();
          year = no / 365;
          no = no % 365;
        //  System.out.println(no);
          System.out.println("Number of years:"+year);
          week = no / 7;
          no = no % 7;
       //   System.out.println(no);
          System.out.println("Number of weeks:"+week);
          day = no;
          System.out.println("Number of days:"+day);
          
          
          
	}

}
