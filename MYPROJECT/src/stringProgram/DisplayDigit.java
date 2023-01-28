package stringProgram;
import java.util.ArrayList;

public class DisplayDigit {
	public static void main(String[] args) {
		
	
	ArrayList obj=new ArrayList();
	System.out.println(obj.getClass().getName());
	System.out.println(obj);
	System.out.println(obj.size());
	System.out.println(obj.isEmpty());
	obj.add(10);
	obj.add(20);
	obj.add(30);
	obj.add("abc");
	System.out.println(obj);
	System.out.println(obj.size());
	System.out.println(obj.isEmpty());
	obj.add(2,"xyz");
	System.out.println(obj);
	System.out.println(obj.size());
	System.out.println(obj.isEmpty());
	obj.remove(2);
	System.out.println(obj);
	System.out.println(obj.size());
	System.out.println(obj.isEmpty());
	System.out.println(obj.get(3));
	
	System.out.println(obj.remove(1));
	System.out.println(obj.remove("abc"));
	}
}
