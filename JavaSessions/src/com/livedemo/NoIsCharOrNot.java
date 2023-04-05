package com.livedemo;

public class NoIsCharOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		    char ch='9';
            if(ch>='a' && ch<='z')
            {
            	System.out.println(ch+" is Character");
            }
            else if(ch>='0' && ch<='9')
            {
            	System.out.println(ch+" is Number");
            }
            else
            {
            	System.out.println("Undefined Input");
            }
	}

}
