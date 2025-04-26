package daythreetask;

import java.util.Scanner;

class Person
{
	 String name;
	 int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
}
public class daythreeq1constr 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter name and age:");
		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
	Person obj = new Person(name,age);
	
	System.out.println("Name is "+ obj.getname());
	System.out.println("Age is "+ obj.getage());
	sc.close();
	}

}
