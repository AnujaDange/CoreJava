package com.assignment_Pattern;

public class CharacterPrint1 {
       
	void print()
	{
		for(char i='e';i>='a';i--)//  i=e  i=d
		{//  						   t    t
			for(char j=i ;j>='a';j--)// j=e  j=d  j=c  j=b  j=a  --- j=d  j=c  j=b  j=a ---  j=c  j=b  j=a --- j=b  j=a --- j=a 
			{//                          t    t    t    t    t         t    t    t    t       t    t    t       t    t       t
			System.out.print(" "+j);//	 e    d    c    b    a         d    c    b    a       c    b    a       b    a       a
			}
			System.out.println();
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterPrint1 obj = new CharacterPrint1();
		obj.print();
	}

}
