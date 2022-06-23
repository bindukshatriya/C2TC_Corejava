package THREAD;

public class thread extends Thread
{
  public void run()
  {
	  System.out.println("hello");
  }
	public static void main(String[] args) 
	{
		Thread t=new thread();
		t.start();
		// TODO Auto-generated method stub

	}

}
