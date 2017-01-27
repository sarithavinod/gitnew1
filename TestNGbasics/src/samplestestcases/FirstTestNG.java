package samplestestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class FirstTestNG {
	public String baseUrl= "http://newtours.demoaut.com/";
		WebDriver  driver;
		public String expected =null;
		public String actual = null;

@BeforeTest
			public void launchbrowser()
			{
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get(baseUrl);
			}
 @BeforeMethod
			 public void Homepagetitle()
			 {
				 expected= "Welcome: Mercury Tours";
				 actual= driver.getTitle();
				 Assert.assertEquals(expected, actual);
			 }

@Test
	
			public void VerifyRegisterlinks()
			{
				driver.findElement(By.linkText("REGISTER")).click();
				expected = "Register: Mercury Tours";
				actual = driver.getTitle();
				 Assert.assertEquals(expected, actual);
			}	
@Test
				public void verifySupportlink()
				{
				driver.findElement(By.linkText("SUPPORT")).click();
				expected = "Under Construction: Mercury Tours";
				actual = driver.getTitle();
				 Assert.assertEquals(expected, actual);
			}

@AfterMethod
			public void backHomepage()
			{
				driver.navigate().back();
			}

@AfterTest
public void Terminatebrowser()
{
	driver.close();
}
}
