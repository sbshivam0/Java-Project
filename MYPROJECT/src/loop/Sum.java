package loop;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
Scanner s1 = new Scanner(System.in);
System.out.println("enter number till where u have to find sum");
int n = s1.nextInt();
int sum=0;
for (int i=1;i<=n;i++) {
sum=sum+i;

}
System.out.println(sum);


	}

}
