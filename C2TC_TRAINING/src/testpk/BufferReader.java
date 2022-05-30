package testpk;

import java.util.Scanner;

public class BufferReader {

	public static void main(String[] args)throws Exception {
		//inputStreamReader r=new inputStreamReader(System.in);
		//BufferReader br=new BufferReader(r);
		//System.out.println("enter your name");
		//String name=br.readLine();
		//System.out.println("welcome"+name);
		// TODO Auto-generated method stub
				Scanner reader=new Scanner(System.in);
				System.out.println("enter an integer");
				boolean b=reader.hasNextInt();
			    System.out.println("you enter integer:" +b);
				
				
				// TODO Auto-generated method stub

			}

}
