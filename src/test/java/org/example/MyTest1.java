package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/* import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List; */
import java.util.concurrent.TimeUnit;

public class MyTest1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com");


        WebElement webElement1 = driver.findElement(By.xpath("//input[@id='user-name']"));
        webElement1.click();
        webElement1.sendKeys("standard_user");

        WebElement webElement2 = driver.findElement(By.xpath("//input[@id='password']"));
        webElement2.click();
        webElement2.sendKeys("secret_sauce");

        WebElement webElement3 = driver.findElement(By.xpath("//input[@id='login-button']"));
        webElement3.click();






        //driver.quit();
    }
}
