package my;
import java.util.Scanner;

public class ValueOccured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("give the size of 1d array");
		int size=s1.nextInt();
		int []a=new int [size];
		for(int i=0; i<a.length;i++) {
			System.out.println("enter values of array "+i+" index");
			a[i]=s1.nextInt();
			
		}
		System.out.println("the array is ");
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<a.length-1;i++)
		{ int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{count++;
					
					}
				
			}
			System.out.println("no of times value occured"+count++);
		}
	}
}
		

	
