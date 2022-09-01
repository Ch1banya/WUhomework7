package org.example.hw5;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class TryItFreeTest extends AbstractTest{


    //   @Order(6)
    @DisplayName("Test 6")
    @Test
    public void tryItFreetTest() {

        WebElement webElement1 = getDriver().findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
        webElement1.click();

        WebElement webElement2 = getDriver().findElement(By.xpath("//a[contains(text(),'About')]"));
        webElement2.click();

        WebElement webElement3 = getDriver().findElement(By.xpath("//h2[normalize-space()='Cross-browser testing']"));
        webElement3.click();

        //Проверка, что кнопка введет на нужный раздел сайта
        Assertions.assertEquals("https://saucelabs.com/platform/cross-browser-testing",getDriver().getCurrentUrl());

    }

}
