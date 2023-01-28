package stream;
interface Calculator{
	void add(int a, int b);
}

 class Clac{
	 public static void addition(int a, int b )
	 {
		 System.out.println("addition is "+(a+b));
	 }
	 public void adds(int a , int b ) {
		 System.out.println("The sum is ="+(a+b));
	 }
	 
 }
 //Constructor
 interface Message {
	 void getMessage(String msg);
 }
 class Messenger{
	 Messenger(String msg){
		 System.out.println("Message is "+msg );
	 }
	 
 }

public class MethodRefernces {
	public static void main(String[] args) {
		
// general way 
		//Clac.addition(5, 6);
// 1.Refereeing  to static method 
		/*Calculator cal = Clac :: addition;
		cal.add(1, 0)*/
//2.Refereeing  to non-static method
		//first we need to make the object n then we can access 
		Clac cal = new Clac();
		Calculator c1= cal::adds;
		c1.add(4, 5);
	}
//3Refereeing to constructor 
/*	Messenger  mRef= Message::new;
	mRef.
	*/

}
