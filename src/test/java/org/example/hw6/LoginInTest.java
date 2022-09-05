package org.example.hw6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginInTest extends AbstractTest {

    @Test
    void loginIn(){
        new MainShopPage(getWebDriver()).goToShop();
        new LoginPage(getWebDriver())
                .setLogin("standard_user")
                .setPassword("secret_sauce")
                .loginIn();
        Assertions.assertEquals("https://www.saucedemo.com/inventory.html",driver.getCurrentUrl());

    }


}