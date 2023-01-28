package my;

public class AnonymousArray {
	public static void main(String[] args) {
		sum(new int[] {10,20,30,40});
	}

	private static void sum(int[] x) {
		int total=0;
		for(int y:x) {total=total+y;}
		System.out.println("the sum is "+total);
		
	}

}
