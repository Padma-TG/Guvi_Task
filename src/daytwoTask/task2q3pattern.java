package daytwoTask;

import java.util.Scanner;

public class task2q3pattern
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your Pattern Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=1;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(count + " ");
			count++;
			
			}
			System.out.println();
		}
		sc.close();
	}

}
