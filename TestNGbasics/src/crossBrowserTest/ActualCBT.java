package crossBrowserTest;

import java.util.concurrent.TimeUnit;

import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ActualCBT {
	WebDriver driver;
	//OMG
	@BeforeTest
	@Parameters("browser")
	public void openbrowser(String browser)
	{
		if(browser.equals("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		}
		else if(browser.equals("Opera"))
		{
			System.setProperty("webdriver.opera.driver", "operadriver.exe");
			driver= new OperaDriver();
		}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.facebook.com");
	}
	
	
	@Test
	
	public void verifytitle()
	{
		String Expected1= "Facebook - Log In or Sign Up";
		String Actual1= driver.getTitle();
		Assert.assertEquals(Actual1, Expected1);
	}
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
}
