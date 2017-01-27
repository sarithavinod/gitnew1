package samplestestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firstsample
{
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	String Url = "http://www.dell.com/en-us/";
	driver.get(Url);
	String title= driver.getTitle();
	int titlelength= driver.getTitle().length();
	System.out.println("the title of the page is : " +title);
	System.out.println("the length of the page title is : " +titlelength);
	String actualUrl= driver.getCurrentUrl();
	System.out.println(actualUrl);
	if(actualUrl.equals(Url))
			{
		System.out.println("current url is opened");
	}
	else
	{
		System.out.println("verification failed");
		System.out.println(actualUrl);
		System.out.println(Url);
	}
	String pagesource = driver.getPageSource();
	int sourcelength= driver.getPageSource().length();
	System.out.println("the length of the pagesource is : " +sourcelength);
	driver.close()	;
	
	
}
}
