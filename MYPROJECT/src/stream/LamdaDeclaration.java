package stream;

public class LamdaDeclaration {
	public static void main(String[] args) {
		
		
		
		//1...Anonymous Inner Type . We need not to implement the interface we can do it directly by inner type as well. 
		
		/*Cab cabbi= new Cab() {
			
			@Override
			public void bookCab() {
				System.out.println("Cab Boooked !! happy Journey");
				}
		};
		cabbi.bookCab();*/
		Cab cabs=()->{System.out.println("Booked and ready to dispatched to ur location ");};
		cabs.bookCab();
	}

}
