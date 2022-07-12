package GENERIC;

public class GenericClass <T>
{
	 GenericClass()
	 {
		 System.out.println("the generic class is declared now");
	 }
	 public void MethodGeneric(T obj)
	 {
		 System.out.println("the type of the object that is ckass now contain is"+obj.getClass().getSimpleName());
	 }
}
public class Generic{
	public static void main(String[] args) {
		Generic_Class<Integer>tab=new 	Generic_Class<Integer>();
		Integer a=5;
		tab.MethodGeneric(a);
		Generic_Class<String>tab1=new 	Generic_Class<String>();	
		String b="hello world";
		tab1.MethodGeneric(b);
	}
}