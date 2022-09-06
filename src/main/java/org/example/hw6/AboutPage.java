package org.example.hw6;

import org.example.hw6.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AboutPage extends AbstractPage {

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement login;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement submit;

    @FindBy(xpath = "//a[@id='about_sidebar_link']")
    private WebElement about;


    public AboutPage(WebDriver driver) {
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


    public void navigateToAbout(){
        this.about.click();
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("saucelabs"));
    }


    }


