package demoreport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightClickaction {
	WebDriver driver;
	@BeforeTest
	public void openbrowser()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");
		
	}
	
	
	@Test
	public void rightclick()
	{
		WebElement element= driver.findElement(By.xpath(" html/body/div[1]/section/div/div/div/p/span"));
		Actions action = new Actions(driver);
		action.contextClick(element);
		System.out.println(element);
		action.build().perform();
					
	}
	
	@Test
	public void rightclickdelete() throws InterruptedException{
	//	driver.findElement(By.xpath(" html/body/div[1]/section/div/div/div/p/span"));
		WebElement element1=driver.findElement(By.xpath("html/body/ul/li[4]"));
		element1.click();
		Alert alert=driver.switchTo().alert();
		String textEdit = alert.getText();
		
		Thread.sleep(3000);
		System.out.println(textEdit);
		//alert.accept();
			}
	
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
	}
}
