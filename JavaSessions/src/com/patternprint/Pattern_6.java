package com.patternprint;

public class Pattern_6 {

	void num() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}

			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}

			System.out.println("");
		}
	}

	void num2() {
		for (int i = 3; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = i - 1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_6 obj = new Pattern_6();
		obj.num();
		obj.num2();
	}

}
