package sq;
import java.io.*;
import java.util.*;
public class square
{
	int p,q;
	public void find()
	{
		Scanner s2=new Scanner(System.in);
		System.out.print("Enter the length of square :");
		p=s2.nextInt();
	    q=p*p;
		System.out.println("The area of square is :"+q);
	}
}