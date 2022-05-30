package testpk;

public class A {
	void run()
	{
		System.out.println("hi");
	}
	}
class B extends A
{
	void run()
	{
		System.out.println("hello");
	}

void main()
{
	B ob=new B();
    A ob1=new A();
   ob.run();
}
}
