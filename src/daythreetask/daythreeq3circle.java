package daythreetask;

import java.util.Scanner;

class Circle
{
	int radius;
	private float area;
	public Circle()
	{
		System.out.println("Area of Circle");

	}
	public Circle(int r,float pi)
	{
		radius=r;
		calculate(r,pi);
		System.out.println("Area of circle is "+ this.getter());
	}
	public void calculate(int r,float pi)
	{
		 area = (pi*r*r);
	}
	public float getter()
	{
		return area;
	}
		
}
public class daythreeq3circle 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the value of radius");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();

		Circle obj=new Circle();
		obj.calculate(r,22f/7);
        System.out.println("Calculated area using no-arg constructor: " + obj.getter());
        Circle obj2 = new Circle(r, 22f / 7);

		sc.close();
		
	}

}
