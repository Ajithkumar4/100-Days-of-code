import java.io.*;
import java.util.*;
class Study
{
	int marks;
	void getMarks()
	{
		marks = 100;
	}
	void displayMarks()
	{
		System.out.println("Marks :"+marks);
	}
}
interface sports
{
	String game="Cricket";
	public void displaySports();
}
class Student extends Study implements sports
{
	private String name;
	private int rollno;

	public void getStudent()
	{
		name="Ajithkumar";
		rollno=144;
		getMarks();
	}
	public void displayStudent()
	{
		System.out.println("Name :"+name);
		System.out.println("Rollno :"+rollno);
		displayMarks();
	}
	public void displaySports()
	{
		System.out.println("Game :"+game);
	}
}
class StudentTest
{
	public static void main(String []arg)
	{
		Student s=new Student();
		s.getStudent();
		s.displayStudent();
		s.displaySports();
	}
}