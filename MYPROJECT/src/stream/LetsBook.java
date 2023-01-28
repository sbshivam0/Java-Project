package stream;
//This how we do it w/o lambda declaration or inner type

public class LetsBook implements Cab {
 public static void main(String[] args) {
	 Cab cabbi = new LetsBook();
	 cabbi.bookCab();
	 
	
}

@Override
public void bookCab() {
	// TODO Auto-generated method stub
	System.out.println("Booked ");
}
}
