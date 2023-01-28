package stringProgram;
import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Give the desire string to reverse");
	String s1=sc.nextLine();
	String []s=s1.split(" ");
	for (int i=s.length-1;i>=0;i--) {
		System.out.print(s[i]+ " ");
	}
}
}
