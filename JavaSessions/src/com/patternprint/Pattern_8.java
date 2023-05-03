package com.patternprint;

public class Pattern_8
{
	void num1() {
		System.out.println("*");
		for (int i = 1; i <= 4; i++) {
			System.out.print("*");
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println("*");
		}
	}

	void num2() {
		
		for (int i = 3; i >= 1; i--) {
			System.out.print("*");
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println("*");
		}
		System.out.println("*");
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_8 obj = new Pattern_8();
	    obj.num1();
		obj.num2();
		
	}

}
