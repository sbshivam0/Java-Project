package statitBlock;

public class SB1 {
	static 
	{
		System.out.println("static block will execute first");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" then main method will execute ");
	}
	static 
	{
		System.out.println("static block will execute first");
	
	}
	
	

}
