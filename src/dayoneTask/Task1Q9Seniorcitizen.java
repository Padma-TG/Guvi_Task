package dayoneTask;

import java.util.Scanner;

public class Task1Q9Seniorcitizen 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the age of a person:");
		Scanner sc = new Scanner(System.in);
		int Age = sc.nextInt();
		if(Age>=65)
		{
			System.out.println("This person is senior citizen");
		}
		else
		{
			System.out.println("This person is not a Senior citizen");
		}
		sc.close();
	}

}
