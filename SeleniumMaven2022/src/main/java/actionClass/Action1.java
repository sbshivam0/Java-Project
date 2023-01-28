package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notiication");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	
	driver.get("https://www.snapdeal.com/?utm_source=spiffy_c2c_846&utm_campaign=121&utm_content=spiffy_c2c_846&utm_source=spiffy_c2c_846&utm_campaign=121&utm_content=spiffy_c2c_846");
	Actions a = new Actions(driver);
	a.moveToElement(driver.findElement(By.xpath("//span[text()='Sign In']"))).perform();
	driver.findElement(By.xpath("//a[text()='login']")).click();
	
}
}
