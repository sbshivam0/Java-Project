package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action2 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notiication");
	WebDriver driver = new ChromeDriver(options);
	driver.manage().window().maximize();
	
	driver.get("https://jqueryui.com/droppable/");
	driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	WebElement dragElement=driver.findElement(By.id("draggable"));
	WebElement dropElement=driver.findElement(By.id("droppable"));
	
	Actions a = new Actions(driver);
	//a.dragAndDrop(dragElement, dropElement);
	//a.perform();
	a.clickAndHold(dragElement).pause(Duration.ofSeconds(15)).moveToElement(dropElement).release(dragElement).build().perform();
	
}
}
