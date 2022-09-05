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

    public static WebDriver driver;

    @BeforeAll
    public static void init() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com");
    }

    @BeforeEach
    public void login() {


        Assertions.assertEquals("https://www.saucedemo.com/inventory.html",driver.getCurrentUrl());

    }


    @AfterAll
    static void close(){
        //driver.quit();
    }
    public static WebDriver getWebDriver() {
        return driver;
    }
}