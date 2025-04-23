/*TASK 1 Ques 1 */
package dayoneTask;

import java.util.Scanner;

public class Task1Q1GreatestSumValue 
{
	public static void main(String[] args) 
	{
		//declaring the variable
		int a,b,c,d;
		//getting input 
		System.out.println("Enter the value for a,b,c,d");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		//adding the values
		int Sum1=a+b;
		int Sum2=c+d;
		//checking greatest value of sum
		if(Sum1>Sum2)
		{
			System.out.println("Sum of A and B is greater than Sum of C and D");
		}
		else
		{
		System.out.println("Sum of C and D is greater than Sum of A and B");
		}
	sc.close();
	}

}
