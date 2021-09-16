package pack;
import java.util.*;
public class squareOfNum
{
	public void find()
	{
		Scanner sc=new Scanner(System.in);
		int value,sq;
		System.out.println("Enter the value to find square :");
		value=sc.nextInt();
		sq=value * value;
		System.out.println("The square of the given number = " +sq);
	}
}