package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class MyTest4 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com");


        //Удаление товара из корзины
        //Повторная авторизация происходит для всех манипуляций с сайтом, т.к. это особенность данного тестового сайта

        WebElement webElement4 = driver.findElement(By.xpath("//input[@id='user-name']"));
        webElement4.click();
        webElement4.sendKeys("standard_user");

        WebElement webElement5 = driver.findElement(By.xpath("//input[@id='password']"));
        webElement5.click();
        webElement5.sendKeys("secret_sauce");

        WebElement webElement6 = driver.findElement(By.xpath("//input[@id='login-button']"));
        webElement6.click();

        WebElement webElement7 = driver.findElement(By.xpath("//div[@id='shopping_cart_container']"));
        webElement7.click();

        WebElement webElement8 = driver.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
        webElement8.click();



        //driver.quit();
    }
}

