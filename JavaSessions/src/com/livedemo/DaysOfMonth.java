package com.livedemo;

import java.util.Scanner;

public class DaysOfMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter name of month to display number of days = ");
				String mn = sc.nextLine();
				mn=mn.toLowerCase();
				switch(mn)
				{
				case "Jan" :
					System.out.println("31 ");
					break;
				case "feb" :
					System.out.println("28/29");
					break;
				case "mar" :
					System.out.println("31");
					break;
				case "apr" :
					System.out.println("30");
					break;

				case "may" :
					System.out.println("31");
					break;

				case "jun" :
					System.out.println("30");
					break;

				case "jul" :
					System.out.println("31");
					break;

				case "aug" :
					System.out.println("31");
					break;

				case "sep" :
					System.out.println("30");
					break;

				case "oct" :
					System.out.println("31");
					break;

				case "nov" :
					System.out.println("30");
					break;

				case "dec" :
					System.out.println("31");
					break;

					
				}
				
	}

}
