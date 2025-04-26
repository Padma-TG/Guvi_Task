package daythreetask;

import java.util.Scanner;

class Account
{
	//declaring data members
	int acc_bal,acc_no;
	//constructor with no parameter
	public Account()
	{
		System.out.println("You can check your balance here");
	}
	//Constructor with two parameter
	public Account(int acc_bal,int acc_no)
	{
		this.acc_bal = acc_bal;
		this.acc_no = acc_no;
		System.out.println("Account created successfully with account number "+ acc_no);
		
	}
	//method to check balance
	public void check_bal()
	{
		System.out.println("Your account balance is"+ acc_bal);
	}
	//method to deposit
	public void deposit(int d_a)
	{
		acc_bal+=d_a;
		System.out.println("Your account balance is"+ acc_bal);
	}
	//method to withdraw
	public void with_draw(int w_a)
	{
		acc_bal-=w_a;
		System.out.println("Your account balance is"+ acc_bal);

		
	}
	
}

public class daythreeq4AccCheck_bal 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your account balance");
		Scanner sc = new Scanner(System.in);
		int acc_bal=sc.nextInt();
		System.out.println("Enter your account number");
		int acc_no = sc.nextInt();
		Account obj = new Account(acc_bal,acc_no);
		
		while(true)
		{
			System.out.println("Enter 1 to check account balance ,2 to with draw,3 to deposit");
			int value=sc.nextInt();
			if(value == 1)
			{
				 obj.check_bal();
			}
			//withdraw amount
			else if(value == 2)
			{
				System.out.println("Enter your withdraw amount");
				int w_a = sc.nextInt();
				obj.with_draw(w_a);
			}
			//calling deposit
			else if(value == 3)
			{
				System.out.println("Enter your deposit amount");
				int d_a=sc.nextInt();
				obj.deposit(d_a);
			}
			// Exit the program
            else if (value == 4) {
                System.out.println("Exiting...");
                break;  // Exit the loop and end the program
            }
            // Invalid input
            else {
                System.out.println("Invalid input. Please enter a valid option.");
            }
			
		}
	}
	
	}
