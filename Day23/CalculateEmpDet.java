import java.io.*;
import java.util.*;
class employee
{
	String name;
	int exp,daofjo;
	public void getemp()
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the name of the employee :");
	    name=sc.nextLine();
	    System.out.println("Enter the date of joining :");
	    daofjo=sc.nextInt();
	    System.out.println("Enter the over all experience :");
	    exp=sc.nextInt();
   }
}
class manager extends employee
{
	long bp,hra,tax,netsalary;
	public void getmag()
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the basic pay :");
		bp=sc.nextInt();
	    System.out.println("Enter the house rent allowance :");
		hra=sc.nextInt();
		tax=bp/10;
		System.out.println("Tax = " +tax);
		netsalary=bp+hra-tax;
		System.out.println("Net Salary = " +netsalary);

   }
}
class assistant extends employee
{
	long bp,hra,tax,netsalary;
	public void getass()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the basic pay :");
	    bp=sc.nextInt();
		System.out.println("Enter the house rent allowance :");
		hra=sc.nextInt();
	    tax=bp/10;
		System.out.println("Tax = " +tax);
		netsalary=bp+hra-tax;
		System.out.println("Net Salary = " +netsalary);

   }
}
class clerk extends employee
{
	long bp,hra,tax,netsalary;
	public void getcrk()
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the basic pay :");
	    bp=sc.nextInt();
		System.out.println("Enter the house rent allowance :");
		hra=sc.nextInt();
	    tax=bp/10;
		System.out.println("Tax = " +tax);
		netsalary=bp+hra-tax;
		System.out.println("Net Salary = " +netsalary);

   }
}
class CalculateEmpDet
{
	public static void main(String []args)
	{
		manager ma=new manager();
		ma.getemp();
		ma.getmag();
		assistant at=new assistant();
		at.getemp();
		at.getass();
		clerk cl=new clerk();
		cl.getemp();
		cl.getcrk();
	}
}