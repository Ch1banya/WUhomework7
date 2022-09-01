package org.example.hw5;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class AboutTest extends AbstractTest{


    //   @Order(2)
    @DisplayName("Test 2")
    @Test
    public void aboutTest() {

        WebElement webElement1 = getDriver().findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.xpath("//a[contains(text(),'About')]"));
        webElement2.click();

        //Проверка, что после перехода по кнопке About в меню, открывается нужная ссылка
        Assertions.assertEquals("https://saucelabs.com/",getDriver().getCurrentUrl());
    }

}
