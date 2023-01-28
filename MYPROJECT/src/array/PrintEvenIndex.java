package array;

public class PrintEvenIndex {
	public static void main(String[] args) {
		
		int [] a = {1,2,3,4};
		
		for(int i =0;i<a.length;i++) {
			if(i%2==0) {
				System.out.println("a ["+i+"] ="+a[i]);
			}
		}
		
	}

}
