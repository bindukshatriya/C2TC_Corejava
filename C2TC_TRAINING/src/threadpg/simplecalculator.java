package threadpg;

public class simplecalculator {
    void prnsqr(int i)
    {
    	System.out.println("square of the integer"+i+"is"+i*i);
    }
    void prnsqr(float f)
    {
    	System.out.println("square of the float"+f+"is"+f*f);
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       simplecalculator obj=new simplecalculator();
	   obj.prnsqr("i");
       obj.prnsqr('a');
       obj.prnsqr(3);
 
       }
	}
