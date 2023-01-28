package launching;

import java.io.FileNotFoundException;

public class TC_001 extends BaseTest {
	
	public static void main(String[] args) throws  Exception {
		init();
	launcher("firefoxbrowser");
	navigateUrl("amazonUrl");
	launcher("chromebrowser");
	navigateUrl("bestbuyUrl");
	
		
	}
}