//4.	Design a class to overload a function series() as follows:
//(i) double series(double n) with one double argument and returns the sum of the series, 
//sum = 1 / 1 + 1 / 2 + 1 / 3 + … + 1 / n.
//(ii) double series(double a, double n) with two double arguments and returns the sum of the series,
//sum = 1 / a2 + 4 / a5 + 7 / a8 + 10 / a11 + … to n terms.




package com.WrittenBasic_3;

import java.util.Scanner;

public class FunctionSeries4 {
	Scanner sc =new Scanner(System.in);
	
    double series(double n)
    {
    	
    }
    double series(double a, double n)
    {
       
    	double ab= a = 3.0;
    	double nb = 3.0;
    	double s = 0.0;
            //iterating for loop n times
            for (int i = 1; i <= n; i++) {
                //finding sum
                s = s + (i/(a*i));       
              }
            //printing the result
            System.out.println(s);
        }

   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
