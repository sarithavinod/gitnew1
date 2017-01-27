package demoreport;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tooltip {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("http://docs.seleniumhq.org/");
		WebElement ele = driver.findElement(By.xpath("//*[@id='header']/h1/a"));
		
		Actions action = new Actions(driver);
		action.moveToElement(ele);
		Thread.sleep(10000);
		action.perform();
		String Expected=ele.getText();
		System.out.println(Expected);
		String Actual= "Browser Automation";
		
		if(Expected.equals(Actual))
		{
			System.out.println("the text are same");
					}
		else{
			System.out.println("the text did not match");
		}
		driver.close();
	}
	

}
