package launching;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {
public static void main(String[] args) {
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\SHIVAM\\Desktop\\drivers\\chromedriver.exe");
	//WebDriverManager.chromedriver().setup();
//	ChromeDriver driver= new ChromeDriver();
	
//	System.setProperty("webdriver.gecko.driver", "C:/Users/SHIVAM/Desktop/drivers/geckodriver.exe");
// FirefoxDriver driver1= new FirefoxDriver(); 
	
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	
	
	
	
}
}
