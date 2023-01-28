package stringProgram;

import java.util.Scanner;

public class S2 {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the string");
		String var=sc.nextLine();
		String[]s1=var.split(" ");
		for(int i=0;i<s1.length;i++) {
			if(!s1[i].isEmpty()) {
				System.out.println(s1[i]);
				
			}
		}
		
		
	}

}
