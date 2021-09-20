import java.io.*;
import java.util.Scanner;
public class Calculator
{
	public static void main(String[] args)
	{
		System.out.println("     Simple Calculator     ");
		System.out.println();
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter first numbers :");
        double first=reader.nextDouble();
        System.out.print("Enter second numbers :");
        double second=reader.nextDouble();
        System.out.print("Enter an operator (+, -, *, /) : ");
        char operator=reader.next().charAt(0);
        double result;
        switch(operator)
        {
			case '+':
			         result = first + second;
			         break;
            case '-':
                     result = first - second;
                     break;
            case '*':
                     result = first * second;
                     break;
            case '/':
                     result = first / second;
                     break;
            default:
                    System.out.printf("Error! operator is not correct");
                   return;
	   }
       System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
       System.out.println();
   }
}