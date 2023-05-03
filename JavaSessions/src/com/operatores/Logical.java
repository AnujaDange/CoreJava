package com.operatores;
//  logically     T && T = T   and  F || F = F
public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 13;
		int b = 27;
		boolean c = (a < 10 && b > 23);   //F && T = F
		System.out.println("Output of Logical AND = " + c);

		boolean d = (a < 10 || b > 23);  // F || T = T
		System.out.println("Output of Logical OR = " + d);
		System.out.println("Output of Logical NOT = " + !d); // T!=F
	}

}
