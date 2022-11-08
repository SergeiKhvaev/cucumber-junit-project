package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_stepDefinitions {
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();

    @Given("user is on the login Page of wab table app")
    public void user_is_on_the_login_page_of_wab_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }


    @When("user enter user name {string}")
    public void userEnterUserName(String username) {
        webTableLoginPage.usernameBox.sendKeys(username);
    }

    @And("user enter password {string}")
    public void userEnterPassword(String password) {
        webTableLoginPage.passwordBox.sendKeys(password);

    }

    @When("user click to login button")
    public void user_click_to_login_button() {
        webTableLoginPage.loginBth.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));

    }

    @When("user enter username {string} password {string} and logins")
    public void userEnterUserNamePasswordAndLogins(String username, String password) {
        // webTableLoginPage.usernameBox.sendKeys(username);
        //  webTableLoginPage.passwordBox.sendKeys(password);
        // webTableLoginPage.loginBth.click();
        // we interchange those three line by Utility method from WebTablePage class
        webTableLoginPage.logIn(username, password);

    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials) {
        //webTableLoginPage.usernameBox.sendKeys(credentials.get("username"));// remember get(key) - method for map, in order to return value releated to given key
        //webTableLoginPage.passwordBox.sendKeys(credentials.get("password"));
        // webTableLoginPage.loginBth.click();
        // we interchange those three line by Utility method from WebTablePage class
        webTableLoginPage.logIn(credentials.get("username"), credentials.get("password")); //remember get(key) - method for map, in order to return value releated to given key

    }
}
