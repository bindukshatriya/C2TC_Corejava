package threadpg;

interface myinterface
{ 
	public void method1();
	public void method2();
}
 public class interface1 implements myinterface
 {
	 public void method1()
	 {
		 System.out.println("implements of method 1");
	 }
	 public void method2()
	 {
		 System.out.println("implements of method 2");
	 }
   public static void main(String[] args) {
		// TODO Auto-generated method stub
    myinterface obj=new interface1();
    obj.method1();
   }
 }
