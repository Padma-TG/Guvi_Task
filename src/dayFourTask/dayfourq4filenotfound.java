package dayFourTask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dayfourq4filenotfound 
{

	public static void main(String[] args) 
	{
		System.out.println("Trying to read a file from your system");
		String filepath = "C:\\Padma\\Guvi\\Java\\chatgpt1\\chatgptvar.txt";
		try
		{
			File file = new File(filepath);
			Scanner sc = new Scanner(file);
			while(sc.hasNext())
			{
				System.out.println(sc.nextLine());
			}
			sc.close();
		}		

			catch(FileNotFoundException e)
			{
				System.out.println("The file "+filepath+ "doesnt exist"+e.getMessage());
			}
		

	}

}
