package dayoneTask;

import java.util.Scanner;

public class Task1Q5Prime
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the value of N");
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int count  = 0;
			if(n<=1)
			{
				System.out.println("Please enter value greater than 1");
			}
			else
			{
				for(int i=1;i<=n;i++) {
				 if(n%i==0) {
					 count++;
				 }
				}
				 if(count == 2) {
					 System.out.println("It is a prime");
				 }
				 else {
					 System.out.println("Not prime");
				 }
			}
			sc.close();
			}		
	}

