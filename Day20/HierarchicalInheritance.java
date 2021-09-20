import java.io.*;
import java.util.*;
class HierarchicalInheritance
{
	public static void main(String []args)
	{
		Study st=new Study();
		st.getStudent();
		st.getStudy();
		Sports sp=new Sports();
		sp.getSports();
	}
}

class Student
{
	String name,collname,dept;
	int rollno;
	public void getStudent()
	{
		Scanner sc=new Scanner(System.in);
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Name of the student :");
		name=sc.nextLine();
		System.out.print("Enter the Roll No :");
		rollno=in.nextInt();
		System.out.print("Enter the College Name and Department :");
		collname=sc.nextLine();
		dept=sc.nextLine();
	}
}
class Study extends Student
{
	int physics,chemistry,math,biology,total,avg;
	public void getStudy()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Physics marks :");
		physics=sc.nextInt();
		System.out.print("Enter Chemistry marks :");
		chemistry=sc.nextInt();
		System.out.print("Enter Maths marks :");
		math=sc.nextInt();
		System.out.print("Enter Biology marks :");
		biology=sc.nextInt();
		total=(physics+chemistry+math+biology);
		avg=total/4;
		System.out.println("Total =" +total);
		System.out.println("Average =" +avg);
		System.out.println();
	}
}
class Sports extends Student
{
	String teamname;
	int rank;
	public void getSports()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Team Name :");
		teamname=sc.nextLine();
		System.out.print("Enter the International Rank :");
		rank=sc.nextInt();
	}
}