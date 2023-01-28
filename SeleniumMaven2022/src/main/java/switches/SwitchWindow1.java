package switches;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//google will open in incognito mode 
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		//amazon will open in new window with normal mode 
		
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
	}

}
