//java program that reads user input for two integers and perform division.Handle the 
//exception is thrown when second number is zero and display an error msg to user
package dayFourTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class dayfourq1 
{

	public static void main(String[] args) 
	{
		System.out.println("Exception Handling");
		System.out.println("Enter two integers");
		Scanner sc = new Scanner(System.in);
		int a=0,b=0,c;
		try
		{
		 a= sc.nextInt();
		 b=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input mismatch,please enter integer");
			sc.close();
			return;
		}

		try
		{
			if(b==0)
				throw new ArithmeticException("Division by 0 not allowed");
			c= a/b;
			System.out.println(+a+ " divided by " +b+ " is "+c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divisible by zero hence Arithmetic exception occurred " + e.getMessage());
		}
		finally
		{
			System.out.println("Its over");
			sc.close();
		}
	}

}
