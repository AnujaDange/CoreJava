package com.assignment_Switch;

import java.util.Scanner;

public class A_08_SwitchString {
		   public static void main(String[] args) {
			System.out.println("Enter a name of game to display plays name = ");
			Scanner sc = new Scanner(System.in);
			String op = sc.nextLine();
			op=op.toLowerCase();
			switch(op)
			{
			case "cricket" :
				System.out.println("Sachin Tendulkar");
				break;
			case "footballer" :
				System.out.println("Cristiano Ronaldo");
				break;
			case "table tenis" :
				System.out.println("Sharath Kamal");
				break;
			case "badmintone" :
				System.out.println("Saina Nehwal ");
				break;
			case "kabbadi" :
				System.out.println("Anup Kumar");
				break;
				default :
					System.out.println("Invalid Choice!!!");
				
			
			}
		}
	

}
