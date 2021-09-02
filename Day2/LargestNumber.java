import java.io.*;
import java.util.*;
public class LargestNumber
{
	public static void main(String arg[])
	{
		int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements ");
	    n=sc.nextInt();
	    int a[]=new int[n];
	    System.out.println("Enter " +n+" elements");
	    for(int i=0;i<n;i++)
	    {
			a[i]=sc.nextInt();
        }
        System.out.print("largest number of array(");
        for(int i=0;i<n;i++)
	    {
			System.out.print(a[i]+",");
        }
	    System.out.println("-->"+largest(a,n));
    }
	static int largest(int a[],int n)
	{
		int max =a[0];
	    for(int i=1;i<n;i++)
	    {
			if(a[i]>=max)
		    max=a[i];
		}
	     return max;
	}

}