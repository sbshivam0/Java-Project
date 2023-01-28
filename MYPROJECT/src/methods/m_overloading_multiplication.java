package methods;

import java.util.Scanner;

public class m_overloading_multiplication {
	public static int product(int a, int b)
	{
		return a*b;
	}
	public static float product(float a, float b, float c)
	{
		return a*b*c;
	}
	public static double product(double a, double b, double c, double d)
	{
		return a*b*c*d;
	}
	public static double product(int a, float b, double c)
	{
		return a*b*c;
	}
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("two int values ");
		int c=product(sc.nextInt(),sc.nextInt());
		System.out.println(c);
		System.out.println("4 double values");
		System.out.println(product(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble()));
		System.out.println("3 float values");
		System.out.println(product(sc.nextFloat(),sc.nextFloat(),sc.nextFloat()));
		System.out.println("1 int, 1 float , 1 double values");
		System.out.println(product(sc.nextInt(),sc.nextFloat(),sc.nextDouble()));
		
		
	
		

	}

}
