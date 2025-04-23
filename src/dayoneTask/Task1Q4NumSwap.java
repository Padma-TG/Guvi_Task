package dayoneTask;

import java.util.Scanner;

public class Task1Q4NumSwap
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		int a= sc.nextInt();
		int b=sc.nextInt();
		//declaring third variable to swap
		int c;
		c=a;
		a=b;
		b=c;
		//printing the swapped numbers
		System.out.println("Numbers Swapped");
		System.out.println("Value of a is:" + a + " and b is" + b);
		sc.close();
	}

}
