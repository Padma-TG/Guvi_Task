package daytwoTask;

import java.util.Scanner;

public class task2q2Reversestr 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your String ");
		Scanner sc = new Scanner(System.in);
		String str_value=sc.nextLine();
		char[] char_arr = str_value.toCharArray();
		String reverse_str="";
		//using for each
		for(char ch:char_arr)
			reverse_str+=ch;
		//trying for loop
		/*for(int i=(char_arr.length-1);i>=0;i--)
		{
			reverse_str+=char_arr[i];
		}*/
		System.out.println("Reversed string is " + reverse_str);
		sc.close();
	}

}
