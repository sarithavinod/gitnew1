package samplestestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fourthsample {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	WebElement element = driver.findElement(By.name("userName"));
	boolean status = element.isEnabled();

	if(status){
	    element.sendKeys("mercury");
	}
	driver.close();
	}
}
