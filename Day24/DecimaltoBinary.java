import java.io.*;
import java.util.*;
class DecimaltoBinary
{
	int bin[]=new int[100], i=0;
	void binary(int num)
	{
		if(num>0)
		{
			bin[i++]=num%2;
			num=num/2;
			binary(num);
		}
		for(i=i-1; i>=0; i--)
		{
			System.out.print(bin[i]);
		}
	}
	public static void main(String []args)
	{
		System.out.println("    DECIMAL TO BINARY    ");
		DecimaltoBinary db=new DecimaltoBinary();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a Decimal Number :");
		int n=in.nextInt();
		System.out.println("Binary Number is :");
		db.binary(n);
		System.out.println();
	}
}