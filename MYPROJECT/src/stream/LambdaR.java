package stream;

public class LambdaR {
public static void main(String[] args) {
	BookCab cabs=(Source,Dest,dis)->{
		System.out.println("Cab is booked from "+Source+" to "+Dest);
		return dis;
	};
	//cabs.cab("Del", "Mum", 1000.21);
	System.out.println("The distance is "+cabs.cab("Del", "Mum", 1000.21));
}
}
