package daythreetask;

import java.util.Scanner;

class Employee
{
	int empId,ann_sal;
	String firstName,lastName;
	int Salary=0;
	float raise_sal;
	public Employee(int empId,String firstName,String lastName,int Salary)
	{
		this.empId=empId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.Salary=Salary;
	}
	public int getId()
	{
		return empId;
	}
	public String getfirstName()
	{
		return firstName;
	}
	public String getlastName()
	{
		return lastName;
	}
	public String getName()
	{
		return firstName + " " + lastName;
	}
	public void setSalary(int Salary)
	{
		this.Salary=Salary;
	}
	
	public int getSalary()
	{
		return Salary;
	}
	
	public float getRaiseSal()
	{
		this.ann_sal = Salary*12;
		 raise_sal=ann_sal*0.20f+ann_sal;
		return raise_sal;
	}
	
	
}

public class daythreetask2 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter your id,first name,last name,salary");
		Scanner sc = new Scanner(System.in);
		int id=sc.nextInt();
		sc.nextLine();
		String fname=sc.nextLine();
		String lname=sc.nextLine();
		int sal=sc.nextInt();
		Employee obj=new Employee(id,fname,lname,sal);
		System.out.println("Employee[id="+obj.getId()+", name=" +obj.getName()+", salary="+obj.getRaiseSal() + "]");
		sc.close();
	}

}
