package assignment_04_04;

import java.util.Scanner;

public class EvenOddAddition {

	    void add()
	    {
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Enter Starting point =  ");
			int s = sc.nextInt();
			System.out.println("Enter Ending point =  ");
			int e = sc.nextInt();
			System.out.println("*******Range********");
			int ecnt = 0, ocnt = 0;
			int eAdd = 0;
			int oAdd = 0;
	        int even=0;
			while (s <= e) {
				if (s % 2 == 0)
				{
					eAdd = eAdd + s;
				} 
				else
				{
					oAdd = oAdd + s;
				}
				    s++;
			}
			sc.close();
			System.out.println("Addition of Even Numbers = " + eAdd);
			System.out.println("Addition of Odd Numbers = " + oAdd);

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOddAddition obj = new EvenOddAddition();
		obj.add();
	}
}
