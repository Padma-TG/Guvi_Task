package dayoneTask;

import java.util.Scanner;

public class Task1Q7_lengthofStr 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("Length of the string is " + str.length());
		sc.close();
	}

}
