package Screenshot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Multipletestannotations {
	WebDriver driver;
	
	@BeforeMethod
	
	public void openbrowser()
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}

	
	@Test(priority=1)
	public void verifytitle()
	{
		String Expected1= "Facebook - Log In or Sign Up";
		String Actual1= driver.getTitle();
		Assert.assertEquals(Actual1, Expected1);
	}
	
	@Test(priority=0, invocationCount=5)
	public void verifytext1()
	{
		String Expected2= "Share what's new";
		String Actual2= driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/div[2]/div[2]/span[1]")).getText();
		Assert.assertEquals(Actual2, Expected2);
				
	}
	
	@Test(priority=0, enabled=false)
	public void verifytext2()
	{
		String Expected3= "It’s free and always will be.";
	String Actual3= driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[2]/div[1]")).getText();
	Assert.assertEquals(Actual3, Expected3);
	
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
