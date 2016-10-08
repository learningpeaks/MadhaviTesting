package com.basics;

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
    private WebDriver driver;

    @BeforeSuite
    public void initDriver() throws Exception {
        System.out.println("You are testing in firefox");
        driver = new FirefoxDriver();
    }


    @Test
    public void searchTestNGInGoogle() {
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
