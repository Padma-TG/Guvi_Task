//array out of bound
//string out of bound
package dayFourTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class dayfourq2arrstroutofbound 
{

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4};
		String str ="Padma";
		System.out.println("Do you want to check array index or string index");
		Scanner s= new Scanner(System.in);
		String val=s.next();
		//String array="";
		//String strng="";
		if(val.equalsIgnoreCase("array"))
		{
		System.out.println("Enter the array index value to print");
		try
		{
			int i = s.nextInt();
			System.out.println(arr[i]);

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("You are attempting to access the invalid array index " + e.getMessage());
		}
		catch(InputMismatchException e)
		{
			System.out.println("please give in integer format " +e.getMessage());
		}
		}	
		else if(val.equalsIgnoreCase("strng"))
		{
			System.out.println("Enter the string index value to print");
			try
			{
				int i = s.nextInt();
				//char[] strarr = strng.charAt(i);
				System.out.println(str.charAt(i));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println("You are attempting to exceed the length of string "+e.getMessage());
			}
			catch(InputMismatchException e)
			{
				System.out.println("Invalid input ,enter index for string" +e.getMessage());
			}
			
		}
		else
		{
			System.out.println("Enter valid input");
			
		}
		s.close();
	}
	

}
