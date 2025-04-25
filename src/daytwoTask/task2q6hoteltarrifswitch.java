package daytwoTask;

import java.util.Scanner;

public class task2q6hoteltarrifswitch 
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome");
		System.out.println("Enter your Month of Stay");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		if(month>12 || month<1)
		{
			System.out.println("Invalid month");
			
		}
		else
		{
			System.out.println("Enter rent value");
			float rent = sc.nextFloat();
			System.out.println("Enter no of days");
			int days = sc.nextInt();
			switch(month)
			{
			case 4:case 5:case 6:case 11:case 12:
				rent = rent * 0.20f + rent;
				 break;
			case 1:case 2:case 3:case 7:case 8:case 9:case 10:
				break;
			}
			float tot_rent = rent*days;
			System.out.printf("Your total rent value is %.2f",tot_rent);
		}
		sc.close();
	}

}
