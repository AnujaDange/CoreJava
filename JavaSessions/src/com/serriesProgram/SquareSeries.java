package com.serriesProgram;

public class SquareSeries {

	    void series1()
	    {
	    	// 1 2 4 8 16 32 64 
	    	for(int i=1 ; i<=64; i=i*2 )  // i=1 1*2=2   i=2  2*2=4  i=4 4*2=8  i=8 8*2=16
	    	{
	    		System.out.print(" "+i);	
	    	}	
	    	System.out.println();
	    }
	    void series2()
	    {
	    	// 1 4 7 10 13 16 
	    	for(int i=1 ; i<=25 ; i+=3)
	    	{
	    		System.out.print(" "+i);
	    	}
	    	System.out.println();
	    }
	    void series3()
	    {
	    	//1 4 9 16 25 36 
	    	for(int i=1 ; i<=6 ; i++) // i=1 i=1*1=1 
	    	{
	    	System.out.print(" "+(i*i));	
	    	}
	    	System.out.println();
	    }
	    void series4()
	    {
	    	//1 2 6 15 31 56
	    	int x=1;
	    	for(int i=1 ; i<=6; i++)  // int i=1         i=2         i=3
	    	{
	    		System.out.print(" "+x); // x=1         x=2         x=6
	    		x=x+(i*i);  //          x=1+(1*1)=2  x=2+(2*2)=6    x=6+(3*3)=15
	    	}
	    	System.out.println();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareSeries obj = new SquareSeries();
		System.out.println("1st series");
		obj.series1();
		System.out.println("2nd series");
		obj.series2();
		System.out.println("3rd series");
		obj.series3();
		System.out.println("4th series");
		obj.series4();
	}

}
