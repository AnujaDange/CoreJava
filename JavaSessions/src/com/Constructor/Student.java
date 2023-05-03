package com.Constructor;

public class Student {
   int id;
   String name,branch;
   static String university;
   Student(int id,String name,String branch)
   {
	   this.id=id;
	   this.name=name;
	   this.branch=branch;
   }
   static void universityinfo()
   {
	   university="Pune University";
	   System.out.println("Full name : Savitribai Phule Pune University");
   }
   public String toString()
   {
	   return id+" "+name+" "+branch+" ";
   }

}
