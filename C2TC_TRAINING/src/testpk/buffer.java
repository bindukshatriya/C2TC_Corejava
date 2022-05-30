package testpk;

public class buffer {

	public static void main(String[] args)throws Exception {
		inputStreamReader r=new inputStreamReader(System.in);
		bufferReader br=new bufferReader(r);
		System.out.println("enter your name");
		String name=br.readLine();
		System.out.println("welcome"+name);
		// TODO Auto-generated method stub
		}

	void volume(int s)
		{
			int c=s*s*s;
			System.out.println("volume of a cube"+s+"is"+c);
		}

}
