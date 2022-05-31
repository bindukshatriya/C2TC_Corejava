package threadpg;

class A
{
	void run()
	{
		
	}
}
public class FINAL1 extends A {
	 final int speedlimit=10;//final variable
	void run()
	{
		//speedlimit=20;//error
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FINAL1 obj=new FINAL1();
		obj.run();
	}

}
