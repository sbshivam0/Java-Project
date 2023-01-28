package arrayList;
import java.util.*;
public class ALA1 //ArrayList assignment 1
{
	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		obj1.add("Rita");
		obj1.add("Leela");
		obj1.add("Magerita");
		obj1.add("Bata");
		obj1.add("Tata");
		obj1.add("Maala");
		obj1.add("Sonerita");
		System.out.println(obj1);
		ArrayList obj2 = new ArrayList();
		obj2.add("Rita");
		obj2.add("Leela");
		obj2.add("Kokeela");
		obj2.add("Bata");
		obj2.add("rosugulla");
		obj2.add("Maala");
		obj2.add("Sheela");
		System.out.println(obj2);
	System.out.println("print common values of  obj");
	System.out.println(obj1.retainAll(obj2));//before getting commomn values we are checking
	obj1.retainAll(obj2);
	System.out.println(obj1);
	System.out.println(obj1.retainAll(obj2));//after getting commomn values we are checking
	System.out.println("print the different values of obj2 than obj1");
	System.out.println(obj2.removeAll(obj1));////before removing common values we are checking
	obj2.removeAll(obj1);
	System.out.println(obj2);
	System.out.println(obj2.removeAll(obj1));///before removing common values we are checking
		
	}

}
