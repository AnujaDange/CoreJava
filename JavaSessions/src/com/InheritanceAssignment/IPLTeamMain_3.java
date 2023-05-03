/* 3.Create class IPLTeam with method play. Create child classes of IPLTeam
called as CSK, RCB. In main, call play from child class objects.
*/
package com.InheritanceAssignment;

   class IPLTeam
   {
	   void play()
	   {
		 System.out.println("Parent Class :Call Play Method");  
	   }
	   
   }
   class CSK extends IPLTeam
   {
	   void defaultM()
	   {
		   System.out.println("");
	   }
   }
   class RCB extends IPLTeam
   {
	   void defaultM()
	   {
		   System.out.println("");
	   } 
   }
public class IPLTeamMain_3 {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RCB obj1 = new RCB();
		obj1.play();
		CSK obj2 = new CSK();
		obj2.play();
	}

}
