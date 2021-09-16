package rect;
import java.io.*;
import java.util.*;
public class rectangle
{
	int x,y,z;
	public void find()
	{
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter the length of rectangle :");
		x=s1.nextInt();
		System.out.print("Enter the breadth of rectangle :");
		y=s1.nextInt();
		z=x*y;
		System.out.println("The area of rectangle is :"+z);
	}
}