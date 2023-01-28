package conversion;

import java.util.Scanner;

public class DecToHex {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Give the decimal value");
		int n =sc.nextInt();
		String hex="";
		while (n>0)
		{
			int r = n%16;
			switch(r)
			{
			case 10:hex="A"+hex;
			break;
			case 11:hex="B"+hex;
			break;
			case 12:hex="C"+hex;
			break;
			case 13:hex="D"+hex;
			break;
			case 14:hex="E"+hex;
			break;
			case 15:hex="F"+hex;
			break;
			default: hex=hex+r;
			break;
			}
			n=n/16;
		}
		System.out.println("dec to hex " + hex);

	}

}
