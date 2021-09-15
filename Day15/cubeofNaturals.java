import java.io.*;
import java.util.*;
import java.math.*;
class cubeofNaturals
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		double c=0;
		System.out.println("        Number      cube   ");
		for(int i=1;i<=20;i++)
		{
			c=Math.pow(i,3);
			System.out.println("        "+i+"           "+c);
		}
	}
}