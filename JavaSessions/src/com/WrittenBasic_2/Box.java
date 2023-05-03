
/*     3.Create class Box and calculate the volume of box 
        volume=length x width x height  */

package com.WrittenBasic_2;

import java.util.Scanner;

public class Box {
 
	int length , width, height,volume;
	       void volume()
	       {
	    	   Scanner sc = new Scanner(System.in);
	    	   System.out.println("Enter length width and height");
	    	   length=sc.nextInt();
	    	   width=sc.nextInt();
	    	   height=sc.nextInt();
	    	    volume=length * width * height ;
	    	    System.out.println("volume = "+volume);
	    	    
	       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box obj= new Box();
		obj.volume();
             
	}

}
