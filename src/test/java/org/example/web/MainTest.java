package org.example.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/java/org/example/web/chromedriver.exe");
        System.out.println("Test setup");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Test ending");
    }

    @Test
    public void testMain() {
        Assert.assertTrue(true);
        driver.get("https://www.afrilandfirstbank.com");
        System.out.println(driver.getTitle());
    }
}