package threadpg;

public class poly {
	void add(int x,int y)
	{
		System.out.println("adding of 2 numbers"+(x+y));
	}
	void add(int x,int y,float z)
	{
		System.out.println("adding of 3 numbers"+(x+y+z));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        poly ob1=new poly();
        ob1.add(3 , 4);
        ob1.add(4, 5 ,611f);
	}

}
