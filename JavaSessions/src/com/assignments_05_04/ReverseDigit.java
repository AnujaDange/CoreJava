package com.assignments_05_04;

public class ReverseDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int num = 5432, rev = 0,rem;
				while (num != 0)
		    {
					rem = num % 10;
					rev= (rev * 10) + rem;
					num = num/ 10;
				}
				System.out.println("Reverse Number = " + rev);

		
		
	}

}

