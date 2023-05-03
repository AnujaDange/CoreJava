package com.Enumeration;
  // Enum is nothing but class althought it is not initialised using new Keyword
  // syntax 
public class Test_1 {
    enum Week
    {
    	Sun,Mon,Tue,Wed,Thur,Fri,Sat;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week w1 = Week.Sun;
		System.out.println(w1);
		Week w2 = Week.Mon;
		System.out.println(w2);
		Week w3 = Week.Tue;
		System.out.println(w3);
		Week w4 = Week.Wed;
		System.out.println(w4);
		Week w5 = Week.Thur;
		System.out.println(w5);
		Week w6 = Week.Fri;
		System.out.println(w6);
		Week w7 = Week.Sat;
		System.out.println(w7); 
	}

}
