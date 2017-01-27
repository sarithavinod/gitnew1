package Screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshotpage {

	WebDriver driver;
	
	@BeforeTest
	public void browser()
	{
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
	}
	
	@Test
	public void login() throws IOException
	{
	try{
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		getScreenshot();
		driver.findElement(By.name("login")).click();
		
		getScreenshot();
		driver.findElement(By.name("findFlights")).click();
		getScreenshot();
		driver.findElement(By.name("reserveFlights")).click();
		getScreenshot();
		driver.findElement(By.name("passFirst0")).sendKeys("saritha");			
		driver.findElement(By.name("passLast0")).sendKeys("vinod");
		driver.findElement(By.name("creditnumber")).sendKeys("12345");
		driver.findElement(By.name("buyFlights")).click();
		getScreenshot();
	}
	
	//if exception occrs we will take screen shot
	catch(Exception e)
	{
		getScreenshot();
	}
	}
	private void getScreenshot() throws IOException {
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String filename =  new SimpleDateFormat("yyyyMMddhhmmss'.png'").format(new Date());

		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(scrFile, new File("C:\\javascreenshot\\Newtours.png" +filename));
	}
	

	@AfterTest
	public void closebrowser(){
		driver.quit();
	}
}



