package dayoneTask;

import java.util.Scanner;

public class Task1Q2EvenNum 
{
	public static void main(String[] args) 
	{
		//declaring variable and assigning value
		int a;
		//getting input for a
		System.out.println("Enter the value of a");
		Scanner sc = new Scanner(System.in);
				a=sc.nextInt();		
		//checking if its a even number
		if(a%2==0)
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Not an Even number");
		}
		
	sc.close();
	}

}
