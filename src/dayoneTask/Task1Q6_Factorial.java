package dayoneTask;

import java.util.Scanner;

public class Task1Q6_Factorial 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the value of N");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int tem=1;
		for(int i=n;i>=1;i--)
		{
			 tem = i*tem;
		}
		System.out.println("Factorial of "+ n + "is"  + tem);
	sc.close();
	}

}
