package assignment_04_04;

import java.util.Scanner;

public class Rev_Char {
       
	void reverse()
	{
		  Scanner sc = new Scanner(System.in);
          System.out.println("Enter Starting Point Of Character = ");
          char s = sc.next().charAt(0);
          System.out.println("Enter Ending Point Of Character = ");
          char e = sc.next().charAt(0);
          System.out.println("**** Reverse Series of Character ****\n ");
          while(s>=e)
          {
          	System.out.println("         " +s);
          	s--;
          }
          sc.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Rev_Char obj = new Rev_Char();
		obj.reverse();
	}

}
