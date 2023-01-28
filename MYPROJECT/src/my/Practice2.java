package my;

public class Practice2 {
public static void main(String[] args) {
	String s1="listen";
	String s2="silent";
	char [] a=s1.toCharArray();
	char [] b=s2.toCharArray();
	if( a.length==b.length)
	{for (int i=0;i<a.length;i++) {for(int j=0;j<b.length;j++) {
		a[i]=b[j];
	}
	System.out.println("anagram");}

	}
			
}	

	
}