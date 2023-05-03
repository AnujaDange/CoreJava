package com.InheritanceAssignment;
  
  class Car
  {
	  String b_name;
	  String color;
	  int price;
	  void CarInformation()
	  {
		  System.out.println("Printing car information");
	  }
  }
  class Honda extends Car
  {
	  String b_name="Honda";
	  String color="red";
	  int price=300000;
	  void display()
	  {
		  System.out.println(b_name+" "+color+" "+price);
	  }
  }
  class Audi extends Car
  {
	  String b_name="Audi";
	  String color="silver";
	  int price = 500000;
	  void display()
	  {
		  System.out.println(b_name+" "+color+" "+price);
	  }
  }
public class Hierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Honda h =new Honda();
            h.display();
            Audi a =new Audi();
            a.display();
            
	}

}
