package com.cydeo.step_definitions;

import com.cydeo.pages.*;
import com.cydeo.pages.WebOrderPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrder_stepDefinitions {

    WebTableLoginPage webTableLoginPage = new WebTableLoginPage(); // for login
    //WebTableHomePage webTableHomePage = new WebTableHomePage();
    BasePage basePage = new BasePage();
    WebOrderPage webOrderPage = new WebOrderPage();
    WebListOrder webListOrder = new WebListOrder();

    Select select; // in order if we have more than one select dropdowns

    @Given("user is already logged in and on order page")
// that step cucumber find any where in project if we implement it before!!!!!!!!!! (if we implemented it earlier it even not be higlhlited), but here we implementid it first time that why we need login
    public void user_is_already_logged_in_and_on_order_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        webTableLoginPage.logIn(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        BrowserUtils.sleep(1);
        basePage.orderModule.click();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String product) {
        BrowserUtils.sleep(1);
        select = new Select(webOrderPage.dropdownProduct);
        // select.selectByValue("Familybea");
        select.selectByVisibleText(product);
    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
        BrowserUtils.sleep(1);
        // default there are 1, first we need to clean input box
        //webOrderPage.quantityInput.clear();
        // sometime in chrome version -> in that case use that way
        webOrderPage.quantityInput.sendKeys(Keys.BACK_SPACE); // we can use as Keys.BACK_SPACE, Keys.BACK_SPACE as much as needed

        // how to send Integer, key.class accept only String type/ that how we always do that-> use concatenation
        webOrderPage.quantityInput.sendKeys("" + int1);
        // how to send Integer, key.class accept only String type/ that how we always do that-> use String.valueOf(int1) - method, convert to String Integer
        //webOrderPage.quantityInput.sendKeys(String.valueOf(int1));
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String name) {
        BrowserUtils.sleep(1);
        webOrderPage.customerNameInput.sendKeys(name);
    }

    @When("user enters street {string}")
    public void user_enters_street(String street) {
        BrowserUtils.sleep(1);
        webOrderPage.streetInput.sendKeys(street);
    }

    @When("user enters city {string}")
    public void user_enters_city(String city) {
        BrowserUtils.sleep(1);
        webOrderPage.cityInput.sendKeys(city);
    }

    @When("user enters state {string}")
    public void user_enters_state(String state) {
        BrowserUtils.sleep(1);
        webOrderPage.stateInput.sendKeys(state);
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zipcode) {
        BrowserUtils.sleep(1);
        webOrderPage.zipInput.sendKeys(zipcode);
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String cardType) {
        BrowserUtils.sleep(1);
      webOrderPage.creditCardSelection(cardType);

        /*or we can put that login right in step_definition instead calling method from relevant class// we can also make selection of radio button by comparing getAttribute("value")



        for(WebElement eachElement : webOrderPage.creditCardType){
            if(eachElement.getAttribute("value").equalsIgnoreCase(cardType)){
                eachElement.click();
            }
        }

         */



    }





    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String cardNumber) {
        BrowserUtils.sleep(1);
        webOrderPage.cardNumberInput.sendKeys(cardNumber);
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String dateOfExpiration) {
        BrowserUtils.sleep(1);
        webOrderPage.cardExpDate.sendKeys(dateOfExpiration);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
        BrowserUtils.sleep(1);
        webOrderPage.submitBtn.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String nameOfCustomer) {
     //   Assert.assertTrue(webListOrder.textOfFirstRow.isDisplayed());

        Assert.assertEquals(nameOfCustomer, webListOrder.textOfFirstRow.getText());


    }


}
