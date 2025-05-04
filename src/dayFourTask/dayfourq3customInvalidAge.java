package dayFourTask;

import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String s)
	{
		super(s);
	}
}

public class dayfourq3customInvalidAge 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try
		{
			if(age<18)
			{
				throw new InvalidAgeException("Your age should be above 18 ");
			}
			else
			{
				System.out.println("Age is valid");
			}
			
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Age is very less, "+e.getMessage());
		}
		sc.close();
	}

}
