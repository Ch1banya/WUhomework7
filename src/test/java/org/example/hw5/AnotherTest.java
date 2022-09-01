package org.example.hw5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.Test;
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


public class AnotherTest extends AbstractTest{


    //   @Order(1)
    @DisplayName("Test 1")
    @Test
    public void aboutTest() {

        WebElement webElement1 = getDriver().findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.xpath("//a[contains(text(),'About')]"));
        webElement2.click();
    }

}
