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
        new LoginPage(getWebDriver())
                //  .setLogin("standard_user")
              //  .setPassword("secret_sauce")
                .loginIn("standard_user","secret_sauce");
           Assertions.assertEquals("https://www.saucedemo.com/inventory.html",getWebDriver().getCurrentUrl());

    }


}