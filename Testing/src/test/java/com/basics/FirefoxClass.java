package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxClass {
	
	@Test
	
	public void test()
	{
	
	System.setProperty("webdriver.gecko.driver","C://Users//Shreyas//Desktop//jars testng rports//testng reportng jars//geckodriver.exe");

		             // if above property is not working or not opening the application in browser then try below property

		             //System.setProperty("webdriver.gecko.driver","G:\\Selenium\\Firefox driver\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.facebook.com");

		System.out.println("Application title is ============="+driver.getTitle());
		driver.quit();
}
}


	

