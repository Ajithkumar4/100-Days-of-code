import java.io.*;
import java.util.*;
class Addition
{
public static void main(String []arg)
{
	String obj1,obj2;
	Scanner n=new Scanner(System.in);
	System.out.println("Enter the string1:");
	 obj1=n.nextLine();
	 System.out.println("Enter the string2:");
	 obj2=n.nextLine();
	 System.out.println();
	 System.out.println("Concotenated string is:");
	 System.out.println(obj1+" "+obj2);

	 int x,y;
	 System.out.print("Enter the two numbers:");
	 x=n.nextInt();
	 y=n.nextInt();
	 int z=x+y;
	 System.out.println("The reslut is:"+z);
 }
}

