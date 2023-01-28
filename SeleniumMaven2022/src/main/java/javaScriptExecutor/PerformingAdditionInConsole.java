package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformingAdditionInConsole {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		int a=10;
		//int b=20;
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("console.log(argument[0]);",a);
	}

}
