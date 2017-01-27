package samplestestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class thirdsample {

	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		String Url= "http://demoqa.com/";
		driver.get(Url);
		driver.findElement(By.xpath("//*[@id='menu-item-158']/a")).click();
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().to("Url");
	driver.navigate().refresh();
	driver.close();
	
	}
	

}
