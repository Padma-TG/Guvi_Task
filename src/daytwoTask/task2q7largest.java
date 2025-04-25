package daytwoTask;

import java.util.Scanner;

public class task2q7largest 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter three integers to find largest:");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int largest = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println("Largest number is " + largest);
		sc.close();
	}

}
