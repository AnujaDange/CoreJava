package com.Inheritance;

     class Refrigirator
     {
    	 void show()
    	 {
    		 System.out.println("Refrigirator....Parent class");
    	 }
     }
     // Whirlpool class inherites from Refrigirator
	  class Whirlpool extends Refrigirator
	  {
		 void show()
		 {
			 super.show();
			 System.out.println("Whirlpool...");
		 }
	  }
	  // Samsung class inherites from Refrigirator
	  class Samsung extends Refrigirator
	  {
		  void show()
			 {
			  super.show();
				 System.out.println("Samsung...");
			 } 
	  }
	  public class MethodOverriding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Refrigirator r ;
		r= new Whirlpool();
		r.show();
		r= new Samsung();
		r.show();
		
       
	}

}
