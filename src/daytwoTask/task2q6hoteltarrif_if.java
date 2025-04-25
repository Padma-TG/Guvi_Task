package daytwoTask;

import java.util.Scanner;

public class task2q6hoteltarrif_if
{

	public static void main(String[] args) 
	{
		System.out.println("Welcome ");
		System.out.println("Enter your month of stay");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		if(month>12 || month<1)
		{
			System.out.println("Invalid month");
		}
		else
		{
		System.out.println("Enter your rent per day");
		float rent = sc.nextFloat();
		System.out.println("Enter no of days to stay");
		int days = sc.nextInt();
		if((month>=4 && month <=6)||(month>=11 && month <=12))
		{
			float peak_rent= (rent*0.20f+rent) * days;
			System.out.printf("Your total rent value is ₹%.2f\n" ,peak_rent);
		}
		else if((month>=1 && month <4)||(month >=7 && month <11))
		{
			float non_peak_rent = rent * days;
			System.out.printf("Your total rent value is ₹%.2f\n" ,non_peak_rent);
		}
		}
		sc.close();
	}

}
