package switches;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameSwitches {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		WebElement frames2=driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(frames2);
		driver.findElement(By.linkText("WebDriver")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(driver.findElement(By.name("classFrame")));
		driver.findElement(By.linkText("SearchContext")).click();
	}

}
