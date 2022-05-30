package threadpg;

public class StaticMethodExample {
	
		// TODO Auto-generated method stub
		//static variable
		int j=100;
		int n=200;
		//static method
		static void a()
		{
			int a=200;
			System.out.println("print from a");
		}
		void a2()
		{
			System.out.println("inside a2");
		}
		public static void main(String[] args) 
		{
			StaticMethodExample ob1=new StaticMethodExample();
			ob1.a2();
			StaticMethodExample.a();
		}
		

	}
	
