package execution;
import java.util.Scanner;
public class SumDigitFor {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
	    System.out.println("Give the input");
		int num=s1.nextInt();
		int sum=0;
		for (int i=num;i!=0;) 
		{
			int digit=i%10;
			sum=sum+digit;
			i=i/10;
		}
		System.out.println("the sum of the digit of "+num+ " is "+sum);
		// TODO Auto-generated method stub
//another way 
		System.out.println("Give the input");
		 int numb=s1.nextInt();
		 int sums =0;
		 for (int i=0;i<numb;)
		 { int digit=numb%10;
		   sums=sums+digit;
		   numb=numb/10;
		  }
		  System.out.println("the sum of the digit of "+numb+ " is "+sums);
		  		 
	}
}