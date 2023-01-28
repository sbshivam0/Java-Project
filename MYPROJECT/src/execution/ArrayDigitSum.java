//WAP to replace the given array values with sum of each digits ex if a[0] is 12 we should replace it as 3 (1+2)
package execution;
import java.util.Scanner;
public class ArrayDigitSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("give the size of array");
		int size =sc.nextInt();
		int a[]=new int[size];
		for (int i=0;i<a.length;i++)
		{
			System.out.println("give the value of index "+i);
			a[i]=sc.nextInt();
		}
		System.out.print("the array is [ ");
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
	    }
		System.out.print(" ]");
		System.out.print(" ");
		
		for (int i=0;i<a.length;i++) {
			
			int sum=0;
			for (int j=a[i];j!=a[i];) 
			{
				int digit=j%10;
				sum=sum+digit;
				j=j/10;
			}
			System.out.println("the sum of digit of index "+i +" equal to "+sum );
			
		}
		
		
		
		

	}

}
