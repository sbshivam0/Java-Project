package switches;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//ChromeOptions options =new ChromeOptions();
		//options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.icicibank.com/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		String parentWindow=driver.getWindowHandle();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		while(!wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='d-img image-media']//child::img[@alt='HL']"))).isDisplayed()) {
			driver.findElement(By.xpath("//div[@class='banner-slider hero-mobile hero-desktop i-home-banner slick-initialized slick-slider slick-dotted']/button[@class='slick-next slick-arrow']")).click();
		}
		
		driver.findElement(By.xpath("//div[@class='d-img image-media']//child::img[@alt='HL']")).click();
		
		Set<String> wins = driver.getWindowHandles();
		List<String> listWin= new ArrayList(wins);
		
		for(String i :listWin) {
			System.out.println(i);
		}
		System.out.println(driver.getTitle()+"----->"+driver.getWindowHandle());
		driver.switchTo().window(listWin.get(1));
		
	    System.out.println(driver.getTitle()+"------>"+driver.getWindowHandle());
		
		
	}

}
