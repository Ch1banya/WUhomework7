package org.example.hw6;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AboutPageTest extends AbstractTest {

    @Order(1)
    @Test
    void loginIn(){
        new LoginPage(getWebDriver())
                //  .setLogin("standard_user")
                //  .setPassword("secret_sauce")
                .loginIn("standard_user","secret_sauce");
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html",getWebDriver().getCurrentUrl());

    }
    @Order(2)
    @Test
    void clickToAbout(){
        new AboutPage(getWebDriver()).navigateToAbout();
        Assertions.assertEquals("https://saucelabs.com/",getWebDriver().getCurrentUrl());
    }


}
