package com.livedemo;

import java.util.Scanner;

public class DivisibleBy8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter number => ");
                  int no = sc.nextInt();
                  if (no % 8 == 0)
          		{
          			System.out.println("Number is divisible");
          		}
          		else 
          		{
          			System.out.println("Number is not divisible");
          		}
	}

}
