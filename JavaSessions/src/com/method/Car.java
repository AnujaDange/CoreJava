package com.method;

public class Car {

           int id ;
           String name,c_name;
           double price;
           int year;
           void setData(int id, String name , String c_name , double price, int year)
           {
        	     this.id=id;
        	     this.name=name;
        	     this.c_name=c_name;
        	     this.price=price;
        	     this.year=year;
           }
           
           public String toString()
           {
        	   return id+" "+name+" "+c_name+" "+price+" "+year;
           }
       
        	   

	}


