package staticVariable;

public class SV1 {
	static int a;
	public static void main(String[] args) {
		a=10;
		System.out.println(a);
		SV1 o1=new SV1();
		o1.a=100;
		SV1 o2=new SV1();
		o2.a=200;
		
		System.out.println(o1.a);
		System.out.println(o2.a);
		System.out.println(a);
		System.out.println(SV1.a);
		
		
	}

}
