package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class AL1 {
	
	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		System.out.println(a1);
		a1.add(1);
		a1.add(2);
		a1.add(2);
		a1.add(3);
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		a2.add('a');
		a2.add('b');
		a2.add('c');
		ArrayList a3=new ArrayList();
		a3.add("abc");
		a3.add("def");
		a3.add("ghi");
		System.out.println(" addition/copying by constructor of other object");
		
		ArrayList mix=new ArrayList(a1);
		System.out.println("after constructor the copied  the values of object a1");
		System.out.println(mix);
		System.out.println("addAll is used for the coping the values from one object to other");
		mix.addAll(a2);
		mix.addAll(a3);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(mix);
		mix.remove(1);
		System.out.println("removed one value");
		System.out.println(mix);
		System.out.println("used mix.remove(abc) in print satement which will give boolean o/p");
		System.out.println(mix.remove("abc"));
		System.out.println("accessing arraylist values by the help of for loop");
		for(int i=0;i<mix.size();i++) {
			System.out.print(mix.get(i)+" ");
			}
		System.out.println();
			System.out.println("accessing the arraylist values by help of for each loop");
			for(Object a: mix) {
				System.out.println(a);
			}
			/*mix.clear();
			System.out.println(mix);*/
			
			
			
		
		
		
	}

}
