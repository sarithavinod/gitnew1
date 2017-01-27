package demoreport;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTitle {
	WebDriver driver;
	@BeforeTest
	
	public void openbrowser()
	{
		
		driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}
	
	
	
	@Test
	public void actualtest()
	{
		String expectedTitle =  "https://www.facebook.com" ;
		String actualTitle = "https://www.facebook.com";
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	@AfterTest
	public void end()
	{
		driver.close();
	}
	
}
