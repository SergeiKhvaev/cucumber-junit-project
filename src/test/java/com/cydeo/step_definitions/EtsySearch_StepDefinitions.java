package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearch;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.swing.*;

public class EtsySearch_StepDefinitions {

    EtsySearch etsySearch = new EtsySearch();
    @Given("user is on www.etsy.com")
    public void user_is_on_www_etsy_com() {
        Driver.getDriver().get("https://www.etsy.com");

    }

    @Then("user sees title Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone")
    public void user_sees_title_etsy_shop_for_handmade_vintage_custom_and_unique_gifts_for_everyone() {

        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title NOT MATCHED", expectedTitle, actualTitle);

    }

    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
      etsySearch.searchBox.sendKeys("Wooden Spoon");


    }
    @When("user clicks search button")
    public void user_clicks_search_button() {
        etsySearch.searchBtn.click();
    }
    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        String expected = "Wooden spoon";
        String actual =  Driver.getDriver().getTitle();
        System.out.println(Driver.getDriver().getTitle());

        Assert.assertTrue("Wooden Spoon not contains in Title", actual.contains(expected)); // expected result is Wooden Spoon, but actual result is Wooden spoon

    }

    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String searchKeyword) {

        etsySearch.searchBox.sendKeys(searchKeyword);
        etsySearch.searchBtn.click();


    }
    @Then("User sees {string} is in the title")
    public void user_sees_is_in_the_title(String expectedTitle) {
        String actual = Driver.getDriver().getTitle();

        Assert.assertEquals("Title NOT matched", expectedTitle, actual);

    }


}