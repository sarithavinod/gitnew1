package samplestestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class samplesecond {
	
	public static void main(String[] args) {
		
	WebDriver driver =  new FirefoxDriver();
	driver.get("http://demoqa.com/frames-and-windows/");
	driver.findElement(By.xpath("//*[@id='ui-id-1']")).click();
	driver.close();
	}
}
