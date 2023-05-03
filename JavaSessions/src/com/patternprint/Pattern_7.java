package com.patternprint;

public class Pattern_7 {

	   void char_1()
	   {
			
				for(char i='e';i>='a';i--)
				{ 						  
					for(char j='a' ;j<=i ;j++)
					{
						System.out.print(" "+j);
				    }
					System.out.println();
				}
  
	   }

	   void char_2()
	   {
			
				for(char i='a';i<='e';i++)
				{ 						  
					for(char j='a' ;j<=i ;j++)
					{
						System.out.print(" "+j);
				    }
					System.out.println();
				}
  
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern_7 obj = new Pattern_7();
		obj.char_1();
		obj.char_2();
	}

}
