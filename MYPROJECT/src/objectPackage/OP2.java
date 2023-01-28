package objectPackage;

public class OP2 {
	String name;
	int age ;
	OP2 (String a, int b){
		this.name=a;
		this.age=b;
	}
	// override the toString Method
		public String toString() {
			return this.name+" "+this.age;
		}
	public static void main(String[] args) {
		OP2 obj1 =new OP2("dinga",10);
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj1.age);
		System.out.println(obj1.name);
		OP2 obj2 =new OP2("dingi",11);
		System.out.println(obj2);
		System.out.println(obj2.toString());
		System.out.println(obj2.age);
		System.out.println(obj2.name);
	}

}
