package com.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;



/**
 * Created by a6000502 on 10/2/16.
 */
public class FirstTest {
	public WebDriver driver;

    @BeforeSuite
    public void initDriver() throws Exception {
        System.out.println("You are testing in firefox");
        System.setProperty("webdriver.gecko.driver","C://Users//Shreyas//Desktop//jars testng rports//testng reportng jars//geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
    }


    @Test
    public void searchTestNGInGoogle() {
    	//System.setProperty("webdriver.firefox.marionette","C:\Users\Shreyas\Desktop\jars testng rports\testng reportng jars\geckodriver.exe");
    	//driver.manage().timeouts.implicitWait(30,TimeUnit.SECONDS); 
    	final String searchKey = "TestNG";
        System.out.println("Search " + searchKey + " in google");
        driver.navigate().to("http://www.google.com");
        WebElement element = driver.findElement(By.name("q"));
        System.out.println("Enter " + searchKey);
        element.sendKeys(searchKey);
        System.out.println("submit");
        element.submit();
        /*(new WebDriverWait(driver, 10)).until(new ExpectedCondition() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase()
                        .startsWith(searchKey.toLowerCase());
            }
        });*/
        System.out.println("Got " + searchKey + " results");
    }

    @AfterSuite
    public void quitDriver() throws Exception {
        driver.quit();
    }
}
