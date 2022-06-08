package exception;

public class nestedtry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      {
    	  int arr[]=new int[6];
    	  arr[3]=20/0;
    	  System.out.println("i am in try block");
      }
      catch(ArithmeticException ae)
      {
    	  System.out.println("A number cannot be divisible by zero,illegal operation");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
    	 System.out.println("Accessing array element outside of specified limit");
      }
      catch(Exception e)
      {
    	  System.out.println(e.getMessage());
      }
      System.out.println("out of try-catch block");
	}

}
