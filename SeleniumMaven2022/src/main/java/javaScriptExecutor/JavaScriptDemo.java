package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('email').value='shivam'");
		String title = js.executeScript("return document.title").toString();
		
		System.out.println(title);
		//scroll to certain height
		//js.executeScript("window.scrollBy(0,100)");
		
		//scroll to end of page 
		//js.executeScript("window.scrollBy(0,document.body.scrollToHeight)");
		
		//scroll till certain element
		
		//js.executeScript("window.scrollBy(0,document.getElementByClassName('login').scrollIntoView)");
		
		js.executeScript("window.history.back()");
		Thread.sleep(4000);
		js.executeScript("window.history.forward()");
		Thread.sleep(4000);
		js.executeScript("window.history.go(0)");
		
		
		
		
		
		
		
	}
	

}
