package demoreport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment18 {
WebDriver driver;
	

@BeforeMethod
		public void openbrowser()
			{
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://www.dropbox.com/");
			}
	
	
	
@Test(invocationCount = 5)
	public void test()
	{
		System.out.println(driver.getCurrentUrl());
		
	}
	
	
	
@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
	
}
