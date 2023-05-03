package com.Enumeration;

//A Java program to demonstrate working on enum
//in switch case (Filename Test. Java)

import java.util.Scanner;

//An Enum class
enum Day {
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY;
}

//Driver class that contains an object of "day" and
//main().
public class Test_2 {
	Day day;

	// Constructor
	public Test_2(Day day) 
	{
		this.day = day;
	}

	// Prints a line about Day using switch
	public void dayIsLike()
	{
		switch (day) 
		{
		case MONDAY:
			System.out.println("Mondays are bad.");
			break;
		case FRIDAY:
			System.out.println("Fridays are better.");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best.");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	// Driver method
	public static void main(String[] args)
	{
		System.out.println("Enter Day = ");
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		str=convertToLower();
		Test_2 t1 = new Test_2(Day.valueOf(str));
		t1.dayIsLike();
	}

	private static String convertToLower() {
		// TODO Auto-generated method stub
		return null;
	}
}
