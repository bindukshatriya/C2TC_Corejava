
package LAMDA;
interface statement{
	public String greet();
}
public class LamdaNP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
statement s=()->{return "hello world";};
System.out.println(s.greet());
}

}
