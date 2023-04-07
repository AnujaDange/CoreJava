package serriesProgram;

public class SquareSeries {

	    void square()
	    {
	    	// 1 2 4 8 16 32 64 
	    	for(int i=1 ; i<=64; i=i*2 )
	    	{
	    		System.out.print(" "+i);	
	    	}	
	    }
	  /*  void series1()
	    {
	    	// 1 4 7 10 13 16 
	    	int x=1;
	    	for(int i=1 ; i<=25 ; i+=3)
	    	{
	    		System.out.println(i);
	    	}
	    }   */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquareSeries obj = new SquareSeries();
		obj.square();
		//obj.series1();
	}

}
