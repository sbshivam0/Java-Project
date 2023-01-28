package javaScriptExecutor;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateWithoutGetOrNavigateTo {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	    Dimension dim = new Dimension(500,500);
		driver.manage().window().setSize(dim);
		
		driver.get("https://www.facebook.com");
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		//using js to navigate to dif url
		
		js.executeScript("window.location='https//www.google.com'");
	}

}
