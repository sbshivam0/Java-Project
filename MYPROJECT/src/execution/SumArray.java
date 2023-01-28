package execution;
import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("give the size of array");

		int size = sc.nextInt();
		int a[] = new int[size];

		int num = 0, sum = 0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("give the value of index " + i);
			a[i] = sc.nextInt();
		}

		System.out.println("ender the index value");
		int j = sc.nextInt();
		if (a[j] > 10) {
			num = a[j] % 10;
			sum = (a[j] / 10) + num;

		}

		System.out.println("the sum of digit of index " + j + " equal to " + sum);

	}



}
