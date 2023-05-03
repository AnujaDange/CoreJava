// 	WAP to print even numbers from 121 to 229 using while loop. 
package com.WrittenBasic_1;

public class A_04_EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1 = 121;
		int no2 = 229;
		System.out.println("Even Numbers from 121 to 229 ");
		while (no1 <= no2) {
			if (no1 % 2 == 0) {
				System.out.println("     " + no1);
			}
			no1++;
		}

	}

}
