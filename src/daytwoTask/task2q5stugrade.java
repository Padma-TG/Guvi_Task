package daytwoTask;

import java.util.Scanner;

public class task2q5stugrade 
{

	public static void main(String[] args) 
	{
		System.out.println("ANNA UNIVERSITY GRADING SYSTEM");
		System.out.println("Enter your marks to know your grade");
		Scanner sc = new Scanner(System.in);
		int Marks = sc.nextInt();
		if(Marks>100)
		{
			System.out.println("Invalid input");
		}
		else if(Marks == 100)
		{
			System.out.println("S");
		}
		else if(Marks>=90 && Marks<=99)
		{
			System.out.println("A");
		}
		else if(Marks>=80 && Marks<=89)
		{
			System.out.println("B");
		}
		else if(Marks>=70 && Marks<=79)
		{
			System.out.println("C");
		}
		else if(Marks>=60 && Marks<=69)
		{
			System.out.println("D");
		}
		else if(Marks>=50 && Marks<=59)
		{
			System.out.println("E");
		}
		else if(Marks<50)
		{
			System.out.println("F");
		}
		sc.close();
	}

}
