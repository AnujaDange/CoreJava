package com.assignment_Pattern;
  
/*     *****
        ****
         ***
          **
           *
*/

public class A_01_Pattern {

	void pattern() {
		int r = 5;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= r; j++) {
				if( i<j || i==j){
					System.out.print("*");
				}
				else
				{
				System.out.println(" ");
				}
			}
			}
			System.out.println();
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_01_Pattern obj = new A_01_Pattern();
		obj.pattern();
	}

}
