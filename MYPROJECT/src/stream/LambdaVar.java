package stream;

public class LambdaVar {
	int instanceVar=10;
	static int svar =100;
	public static void main(String[] args) {
		LambdaVar v1= new LambdaVar();
		
		BookCab cabs=(Source, Dest, dis)->{
			System.out.println("Cab is booked from "+Source+"to"+Dest+"total dis is "+dis);
			System.out.println();
			System.out.println("instanceVar"+v1.instanceVar);
			System.out.println("static global variable "+LambdaVar.svar);
			int localVar=1000;
			System.out.println("LocalVar="+localVar);
			
			
			
			return 860.15;
		};
		System.out.println("The fare is ="+cabs.cab("Del","Mum",1500.00));
	}

}
