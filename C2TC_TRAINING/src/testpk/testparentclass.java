package testpk;

public class testparentclass {
	int var=100;
}
class testchildclass extends testparentclass
{
	int var=50;
	void display()
	{
	
	System.out.println("the var value of child:"+var);
	System.out.println("the var value of parent:"+super.var);
	}
}
class main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	testchildclass tcc=new testchildclass();
			tcc.display();
	}
}
