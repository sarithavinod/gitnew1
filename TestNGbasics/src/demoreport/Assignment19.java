package demoreport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Assignment19 {

	WebDriver driver;
	@BeforeTest

public void openbrowser(){
driver=new  FirefoxDriver();	
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("https://www.facebook.com");

}
@Test
public void login()
{
String Expectedtest= "Facebook - Log In";
String Actualtest= driver.getTitle();
Assert.assertEquals(Actualtest,Expectedtest);
}
	
	@Test
	public void checktext(){
		String Expected= "Connect with friends and the world around you on Facebook";
		WebElement Actual= driver.findElement(By.xpath("//*[@id='content']/div/div/div/div/div[1]/h2"));
				
	}
	
	
}
