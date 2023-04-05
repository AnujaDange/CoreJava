package com.livedemo;

import java.util.Scanner;

public class VowelUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character = ");
		char ch = sc.next().charAt(0);
		switch (ch) {
		case 'a':

		case 'e':

		case 'i':

		case 'o':

		case 'u':
			System.out.println(ch + " is Vowel");
			break;
		default:
			System.out.println(ch + " is Consonant");
			break;

		}
	}

}
