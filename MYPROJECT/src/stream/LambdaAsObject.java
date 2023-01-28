package stream;

public class LambdaAsObject {
public static void main(String[] args) {
	LambdaComparator compares=(a,b)->{return a>b;};
	
	
	
	boolean result=compares.compare(1, 2);
	System.out.println(result);
	
}
}
