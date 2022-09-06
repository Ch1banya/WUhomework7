package org.example.hw6;

import org.example.hw6.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShopRemovePage extends AbstractPage {

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement login;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement submit;

    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    private WebElement buyItem;

    @FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
    private WebElement removeItem;


    public ShopRemovePage(WebDriver driver) {
        super(driver);
    }

    public void loginIn(String login, String password) {

        Actions loginIn = new Actions(getDriver());
        loginIn
                .sendKeys(this.login, login)
                .click(this.password)
                .sendKeys(password)
                .click(this.submit)
                .build()
                .perform();
    }


    public void buyItem() {

        this.buyItem.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("inventory"));


    }

    public void removeItem() {

        this.removeItem.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("inventory"));


    }
}
