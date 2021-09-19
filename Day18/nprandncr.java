import java.io.*;
import java.util.*;
public class nprandncr
{
	public static int fact(int num)
	{
		int fact=1, i;
		for(i=1; i<=num; i++)
		{
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String args[])
	{
		int n, r;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of N :");
		n=sc.nextInt();
		System.out.print("Enter Value of R :");
		r=sc.nextInt();
		System.out.println();
		System.out.println("NCR = " +(fact(n)/(fact(n-r)*fact(r))));
		System.out.println("Npr = " +(fact(n)/(fact(n-r))));
	}
}