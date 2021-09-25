import java.io.*;
import java.util.*;
class Floyd
{
	public static void main(String args[])
	{
		System.out.println("  FLOYD'S TRIANGLE   ");
		int n,num=1,x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		n=sc.nextInt();
		System.out.println();
		for(x=1; x<=n; x++)
		{
			for(y=1; y<=x; y++)
			{
				System.out.print(" "+num++);
			}
			System.out.println();
		}
	}
}
