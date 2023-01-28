package execution;
import java.util.Scanner;

public class ArraySeperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Give the input");
		int size =sc.nextInt();
		int a[]=new int[size];
		for (int i=0;i<a.length;i++)
		{ 
			System.out.println("give the values for index"+i);
			a[i]=sc.nextInt();
	    }
		System.out.println("given array");
		System.out.print("[");
		for (int i=0;i<a.length;i++)
		{ 
			System.out.print(a[i]+" ");
			
		}
		System.out.println("]");
		System.out.println("Negative  array ");
		System.out.println("[");
		for (int i=0;i<a.length;i++)
		{ 
			if(a[i]<0)
			{
			System.out.print(a[i]+" ");
			}
		}
		System.out.println("]");
		System.out.println("Positive  array ");
		System.out.println("[");
		for (int i=0;i<a.length;i++) 
		{
		    if(a[i]>0)
			{
				System.out.print(a[i]+" ");
			}
		}  
		System.out.println("]");
			
		}
		

	}


