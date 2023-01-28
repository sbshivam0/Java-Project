package stringProgram;
import java.util.Scanner;

public class Intcap {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the string");
	String st=sc.nextLine();
	char ch[]=st.toCharArray();
	for (int i=0;i<ch.length;i++) {
		if(i==0|| ch[i]==' '&& ch[i-1]==32) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			}
			else if(ch[i]>='A'&&ch[i]<='z') {
				ch[i]=(char)(ch[i]+32);
			}
			
		}
		
	}
	System.out.println(ch);
	
}
}
