import java.io.*;
import java.util.*;
class LinearSearch
{
   public static void main(String args[])
   {
	   int counter, num, item, array[];
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter number of elements:");
       num = sc.nextInt();
       array = new int[num];
       System.out.println("Enter " + num + " integers");

       for (counter = 0; counter < num; counter++)
       array[counter] = sc.nextInt();
       System.out.println("Enter the search value:");
       item = sc.nextInt();
       for (counter = 0; counter < num; counter++)
       {
		   if (array[counter] == item)
		   {
			   System.out.println(item+" is present at location "+(counter+1));
               break;
           }
       }
       if (counter == num)
       System.out.println(item + " doesn't exist in array.");
   }
}

