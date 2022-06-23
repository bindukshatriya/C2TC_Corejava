package exception;

public class nestedtry1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="welcome";
       int x[]= {0,1,2,3,4};// only 5 elements
       {
    	   try 
    	   {
    		  int slength=str.length();
    		  System.out.println("String length:"+slength);
    	
    	   try
    	   {
    		   int y=6;//exception occur
    		   System.out.println(x[y]);
    	   }
    	   catch(ArithmeticException ae)
    	   {
    		   System.out.println("exception thrown");
    		   System.out.println(ae.toString());
    	   }
    	   }
       catch(ArrayIndexOutOfBoundsException aie)
       {
    	   System.out.println("exception thrown");
    	  System.out.println(aie.toString());
       }
       System.out.println("out of block");
	}
}
}
