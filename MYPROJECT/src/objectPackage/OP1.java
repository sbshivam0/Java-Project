package objectPackage;

public class OP1 {
	String name;
	int age ;
	OP1(String a, int b){
		this.name=a;
		this.age=b;
	}
	public static void main(String[] args) {
		OP1 obj1 =new OP1("dinga",10);
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj1.age);
		System.out.println(obj1.name);
		OP1 obj2 =new OP1("dingi",11);
		System.out.println(obj2);
		System.out.println(obj2.toString());
		System.out.println(obj2);
		System.out.println(obj2.age);
		System.out.println(obj2.name);
	

	}
}
