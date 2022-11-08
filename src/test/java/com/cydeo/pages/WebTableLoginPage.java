package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPage {

    public WebTableLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input[name='username']")
    public WebElement usernameBox;

    @FindBy(css = "input[type='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginBth;

    /** utility method for login in WebTable page
     *
     * @param username
     * @param password
     */
    public void logIn(String username, String password) { // it should be instance method, because we will call that method by that class object name!!!!!!!!!!!!!!!!!!!!!!!
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginBth.click();
    }


}
