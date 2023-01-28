package objectPackage;
import java.lang.*;


public class OP3 implements Clonable{
	String name;
	int age;
	

	OP3 (String a, int b){
		this.name=a;
		this.age=b;
	}
	public static void main(String[] args) throws CloneNotSupportedException{
		OP3 obj1 =new OP3("dinga",10);
		System.out.println(obj1);
		System.out.println(obj1.toString());
		System.out.println(obj1.age);
		System.out.println(obj1.name);
		OP3 obj2=(OP3)obj1.clone();
		System.out.println(obj2);
		System.out.println(obj2.toString());
		System.out.println(obj2.age);
		System.out.println(obj2.name);
		
		
}
}