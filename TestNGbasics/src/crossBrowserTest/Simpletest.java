package crossBrowserTest;

//import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simpletest {
	WebDriver driver;
	
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://in.yahoo.com/");
		
			}
	@Test
	public void test() throws Exception
	{
		 driver.findElement(By.id("UHSearchBox")).sendKeys("Jallikattu latest news");		
		//driver.findElement(By.xpath("//*[@id='UHSearchWeb']")).click();
		driver.findElement(By.cssSelector("input[tabindex='2']")).click();
//		Actions action = new Actions(driver);
//		action.moveToElement(mouse).click();
		String Actualres= driver.getTitle();
		System.out.println(Actualres);
		Thread.sleep(3000);
		String Expectedres= "Jallikattu latest news - Yahoo Search Results";
		Assert.assertEquals(Actualres, Expectedres);
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
