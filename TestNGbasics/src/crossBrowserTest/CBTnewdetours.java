package crossBrowserTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTnewdetours {
	
	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void openbrowser(String browser)
	{
	
	if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
	else if(browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.edge.driver", "MicrosoftWebDriver.exe");
		driver = new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");
	
	}
	
	@Test
	public void login() 
	{
			driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		
		driver.findElement(By.name("login")).click();
		
		
		driver.findElement(By.name("findFlights")).click();
		
		driver.findElement(By.name("reserveFlights")).click();
		
		driver.findElement(By.name("passFirst0")).sendKeys("saritha");			
		driver.findElement(By.name("passLast0")).sendKeys("vinod");
		driver.findElement(By.name("creditnumber")).sendKeys("12345");
		driver.findElement(By.name("buyFlights")).click();
		String Expectedresult = "Your itinerary has been booked!";
		String Actualresult = driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[3]/td/p/font/b/font[2]")).getText();
		System.out.println(Actualresult);
		Assert.assertEquals(Expectedresult, Actualresult);
	}
	@AfterTest
	public void closebrowser()
	{
		driver.quit();
	}
}
