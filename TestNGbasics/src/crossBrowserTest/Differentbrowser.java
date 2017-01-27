package crossBrowserTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Differentbrowser {
	
public static void main(String[] args) {
		
		//WebDriver driver = new FirefoxDriver();
//		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
//		WebDriver driver= new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.dropbox.com");
//		driver.close();
		
//		System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
//		WebDriver driver= new EdgeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.dropbox.com");
//		driver.close();
//		
		
		System.setProperty("webdriver.opera.driver", "operadriver.exe");
		WebDriver driver= new OperaDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.dropbox.com");
		driver.close();
		
		
	}
	
	
	

}
