package com.livedemo;

import java.util.Scanner;

public class StateCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter State = ");
		String state = sc.nextLine();
		state=state.toLowerCase();
		switch(state)
		{
		case "maharashtra" :
			System.out.println("Mumbai");
			break;
		case "goa" :
			System.out.println("Panaji");
			break;
		case "madhya pradesh" :
			System.out.println("Bhopal");
			break;
		case "gujarat" :
			System.out.println("Gandhinagar");
			break;
		case "karnataka" :
			System.out.println("Banaglore");
			default :
				System.out.println("Enter valid state !!!");
			case "bihar" :
				System.out.println("Patna");
		break;
			case "andhra pradesh" :
				System.out.println("Amaravati");
				break;
			case "arunachal pradesh" :
				System.out.println("Itanagar");
				break;
			case "chhattisgarh" :
				System.out.println("Raipur");
		}
	}

}
