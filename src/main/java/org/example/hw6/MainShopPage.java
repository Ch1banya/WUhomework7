package org.example.hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainShopPage extends AbstractPage {


    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement goToBuy;

    public MainShopPage(WebDriver driver){
        super(driver);

    }

      public void goToShop(){
        goToBuy.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("saucedemo"));

    }

}
