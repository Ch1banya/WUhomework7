package org.example.hw6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {

    static WebDriver webDriver;

    @BeforeAll
    public static void init() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       webDriver.get("https://www.saucedemo.com");
    }



    @AfterAll
    static void close(){
        //driver.quit();
    }
    public WebDriver getWebDriver() {
        return this.webDriver;
    }
}