package org.example.hw6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement login;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement submit;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void loginIn(){
        this.submit.click();
    }

    public LoginPage setLogin(String login){
        this.login.sendKeys(login);
        return this;
    }

    public LoginPage setPassword(String password){
        this.password.click();
        this.passwordInput.sendKeys(password);
        return this;
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




}