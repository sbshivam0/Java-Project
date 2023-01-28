package launching;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties p; 
	public static Properties mainProp;
	public static Properties childProp;
	public static FileInputStream fin;
	public static String projectPath=System.getProperty("user.dir");
	
	public static void init() throws Exception  {
		fin= new FileInputStream(projectPath+"/src/main/resources/enviroment.properties");
		mainProp= new Properties();
		mainProp.load(fin);
		String e=mainProp.getProperty("env");//prod
		
		
		fin = new FileInputStream(projectPath+"/src/main/resources/"+e+".properties");
		childProp = new Properties();
		childProp.load(fin);
		//String values=childProp.getProperty("amazonurl");
		//System.out.println(values);
		
		
		
		
         fin = new FileInputStream(projectPath+"/src/main/resources/data.properties");
		
		 p = new Properties();
		p.load(fin);
		String value= p.getProperty("chromebrowser");
	//	System.out.println(value);
	}
	
public static void launcher(String browser) {
		
		if(p.getProperty(browser).equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			}
		else if(p.getProperty(browser).equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			
		}
		
	}
	
	
	public static void navigateUrl(String url) {
		driver.get(childProp.getProperty(url));
	
	}

	
	}

