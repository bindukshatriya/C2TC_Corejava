package THREAD;
import java.lang.Runnable;

public class runnable implements Runnable {
		public void run()
		{
			System.out.println("hi");
		}
	public static void main(String[] args) {
		runnable hello=new runnable();
		Thread threadobj=new Thread(hello);
		threadobj.start();
		
	}
}
                                