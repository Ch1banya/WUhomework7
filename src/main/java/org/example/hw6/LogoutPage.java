package org.example.hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutPage extends AbstractPage {

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement login;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement submit;

    @FindBy(xpath = "//button[@id='react-burger-menu-btn']")
    private WebElement menu;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    private WebElement logout;



    public LogoutPage(WebDriver driver) {
        super(driver);
    }


    public void loginIn(String login, String password){

        Actions loginIn = new Actions(getDriver());
        loginIn
                .sendKeys(this.login,login)
                .click(this.password)
                .sendKeys(password)
                .click(this.submit)
                .build()
                .perform();
    }

    public void navigateToMenu(){
        this.menu.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("inventory"));
    }


    public void navigateToLogout(){
        this.logout.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("saucedemo"));
    }

}
