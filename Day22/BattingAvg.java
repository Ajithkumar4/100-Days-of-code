import java.io.*;
import java.util.*;
class BattingAvg
{
	public static void main(String []args)
	{
		int matches,runs,innings,notout;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of matches played :");
		matches=sc.nextInt();
		while(true)
		{
			System.out.println("Enter the number of innings batted :");
			innings=sc.nextInt();
			if(innings<=matches)
			break;
			System.out.println("Enter the number of correctly <=matches");
		}
		while(true)
		{
			System.out.println("Enter number of times notout :");
			notout=sc.nextInt();
			if(notout<=innings)
			break;
			System.out.println("Enter the number of times became notout correctly <=innings");
		}
		System.out.println("Enter the total runs of carrier ");
		runs=sc.nextInt();
		if(innings==notout)
		{
			avg=runs;
		}
		else
		{
			avg=runs/(innings-notout);
			System.out.println("Battind Average=" +avg);
		}
	}
}
