package com.looping;

import java.util.Scanner;

public class PrintTable {
      void table()
      {
    	  //int num=3;
    	  int num ,t ;
    	  Scanner sc = new Scanner(System.in);
    	  System.out.println("Enter number which you want to print table = ");
    	  num=sc.nextInt();
    	  System.out.println("*****Table of "+num+"******");
    	  for(int i=1 ; i<=10 ; i++)
    	  {
    		  t=i*num;
    		  System.out.println(num+"*"+i+"="+t);
    	  }
    	  sc.close();
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintTable obj = new PrintTable();
		obj.table();
	}

}
