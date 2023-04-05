package assignment_04_04;

import java.util.Scanner;

public class Rev_No {

	    void Reverse()
	    {
	    	 Scanner sc = new Scanner(System.in);
	         System.out.println("Enter Starting Point = ");
	         int s =sc.nextInt();
	         System.out.println("Enter Ending Point = ");
	         int e =sc.nextInt();
	         System.out.println("***** Number Series in Reverse Order *****\n");
	        while(s>=e)
	        {
	        	System.out.println("     "+s);
	        	s--;
	        }
	         sc.close();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rev_No obj = new Rev_No();
		obj.Reverse();		
	}
}
