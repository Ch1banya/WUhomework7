package org.example.hw5;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public class LogoutTest extends AbstractTest{


    //   @Order(5)
    @DisplayName("Test 5")
    @Test
    public void logoutTest() {

        WebElement webElement1 = getDriver().findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.xpath("//a[@id='logout_sidebar_link']"));
        webElement2.click();

        // Проверка, что после разлогивания на сайте, возвращает на страницу с логином
        Assertions.assertEquals("https://www.saucedemo.com/",getDriver().getCurrentUrl());


    }

}

