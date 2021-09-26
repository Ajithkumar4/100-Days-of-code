import java.io.*;
import java.util.*;
class Discount
{
	public static void main(String args[])
	{
		String store,productname;
		int quantity;
		double  dis,amount,totalamount,markedprice,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Store Name :");
		store=sc.nextLine();
		System.out.println("Enter the Product Name :");
		productname=sc.nextLine();
		System.out.println("Enter the  Product of Quantity :");
		quantity=sc.nextInt();
		System.out.println("Enter Marked Price :");
        markedprice=sc.nextDouble();
        System.out.println("Enter Discount Percentage :");
        dis=sc.nextDouble();
        s=100-dis;
        amount=(s*markedprice)/100;
        totalamount=quantity*amount;
        System.out.println("Total Amount="+totalamount);

	}
}