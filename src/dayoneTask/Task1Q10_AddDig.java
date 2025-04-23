package dayoneTask;

import java.util.Scanner;

public class Task1Q10_AddDig 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the Number:");
		//Getting input value
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//initializing variable
		int digit_count = 0;
		if (n == 0) {
		    digit_count = 1;
		}
		else
		{
		for(;n>0;)
			{
			digit_count++;
			n=n/10;
			}
		}
		System.out.println(digit_count);
		sc.close();
		}

}
