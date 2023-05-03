
/*   3.	Design a class to overload a function compare( ) as follows:
    (a) void compare (int, int) – to compare two integer values and print the greater of the two integers.
    (b) void compare (char,char) – to compare the numeric value of two characters and print the character with higher numeric value
*/
package com.WrittenBasic_3;

public class OverloadFunction3 {
	
	void compare (int no1, int no2)
	{
		if(no1>no2)
		{
			System.out.println(no1+" is greater than "+no2);
		}
		else
		{
			System.out.println(no2+" is greater than "+no1);
		}
	}
	void compare (char a,char b)
	{
		int comp=Character.compare(a,b);
		if(a>b)
		{
			
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadFunction3 obj1=new OverloadFunction3();
		obj1.compare(90,89);
		obj1.compare('U','Y');
	}

}
