package threadpg;

import java.util.Scanner;

public class volume {
	double c=0,co=0,sp=0;
	void volume(int s)
	{
		int c=s*s*s;
		System.out.println("volume of a cube"+s+"is"+c);
	}
	void volume(int l,int b,int h)
	{
		int co=l*b*h;
		System.out.println("volume of a cube"+co+"is"+co);
	}
	 void volume(float r)
	{
		sp=(4/3)*(3.14)*r*r*r;
		System.out.println("volume of sphere"+r+"is"+sp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s,l,b,h;
		float r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter volume of cube");
		s=sc.nextInt();
		System.out.println("enter volume of cuboid");
		l=sc.nextInt();
		b=sc.nextInt();
		h=sc.nextInt();
		System.out.println("enter volume of cube");
		r=sc.nextFloat();
		volume obj=new volume();
	obj.volume(s);
	obj.volume(l,b,h);
	obj.volume(r);
	}
}

