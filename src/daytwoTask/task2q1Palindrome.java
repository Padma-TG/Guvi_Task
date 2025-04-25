package daytwoTask;

import java.util.Scanner;

public class task2q1Palindrome 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your String");
		Scanner sc = new Scanner(System.in);
		String str_value=sc.nextLine();
		char[] char_array=str_value.toCharArray();
		String reverse_str="";
		for(int i=(char_array.length-1);i>=0;i--)
		{
			reverse_str+=char_array[i];
		}
		if(reverse_str.equalsIgnoreCase(str_value))
		{
			System.out.println("Given String is palindrome");
		}
		else
		{
			System.out.println("Given String is not palindrome");
		}
			
		//System.out.println("Palindrome of "+ str_value + "is" + reverse_str);
		sc.close();
		
	}

}
