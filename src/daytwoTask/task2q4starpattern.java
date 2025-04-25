package daytwoTask;

import java.util.Scanner;

public class task2q4starpattern
{
	public static void main(String[] args) 
	{
		System.out.println("Enter your Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				if(j == i || j == num-i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
		sc.close();

	}

}
