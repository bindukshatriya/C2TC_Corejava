
package ASSIGNMENT;

import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the radius");
       double radius=sc.nextDouble();
       double area = 3.14*radius*radius;
       System.out.println("area of circle="+area);
	}

}