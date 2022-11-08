package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_search_StepDefinitions {
WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();
    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }
    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
wikipediaSearchPage.searchBox.sendKeys("Steve Jobs");
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaSearchPage.submitBtn.click();

    }
    @Then("User sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        String expected = "Steve Jobs";
        Assert.assertTrue("Not matched", Driver.getDriver().getTitle().contains(expected));

    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchWord) {
        wikipediaSearchPage.searchBox.sendKeys(searchWord);

    }
    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String expectedTitle) {
        Assert.assertTrue("Not matched", Driver.getDriver().getTitle().contains(expectedTitle));



    }





}
