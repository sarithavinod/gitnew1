package demoreport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BarnesNoble {
	WebDriver driver;
	@BeforeTest
	public void openbrowser()
	
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(390, TimeUnit.SECONDS);
		driver.get("http://barnesandnoble.com");
		driver.getTitle();
	WebElement books = driver.findElement(By.linkText("Books"));
	Actions action = new Actions(driver);
	action.moveToElement(books).perform();
	driver.findElement(By.linkText("Biography")).click();
	}
	
	@Test
	public void testbegin(){
		String ExpectedText = "Bestsellers";
		String Actualtext= driver.findElement(By.xpath("//*[@id='hotBooksWithDesc']/h2")).getText();
		 Assert.assertEquals(Actualtext, ExpectedText);
	}
	@Test
	public void testbegin1(){
		String Expected= "Biography";
		String Actual= driver.findElement(By.xpath("//*[@id='refinements']/ul[1]/li[2]/a")).getText();
		 Assert.assertEquals(Expected, Actual);
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}

}
