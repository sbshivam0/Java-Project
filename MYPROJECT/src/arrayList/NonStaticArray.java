package arrayList;

public class NonStaticArray {
 Object [] a= {"shivam",2.1,3.14,4};
 public static void main(String[] args) {
	NonStaticArray obj = new NonStaticArray();
	System.out.println(obj.a);
	for(int i=0;i<obj.a.length;i++) {
		System.out.println(obj.a[i]);
	}
	obj.a[0]=1;
	System.out.println(obj.a[0]);
			
}
}
