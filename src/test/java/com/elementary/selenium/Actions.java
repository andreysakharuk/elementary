package com.elementary.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Actions {

    private static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","libs/chrome/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
    }

    @Test
    public void addDeleteButtonClick(){
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Add/Remove Elements")).click();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
