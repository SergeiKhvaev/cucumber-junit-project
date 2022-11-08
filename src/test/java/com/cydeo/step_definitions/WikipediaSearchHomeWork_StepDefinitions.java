package com.cydeo.step_definitions;

import com.cydeo.pages.WikipediaSearchPageHomeWork;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikipediaSearchHomeWork_StepDefinitions {
WikipediaSearchPageHomeWork wikipediaSearchPageHomeWork = new WikipediaSearchPageHomeWork();
    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
wikipediaSearchPageHomeWork.searchBox.sendKeys("Steve Jobs");
    }
    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaSearchPageHomeWork.submitBtn.click();

    }
    @Then("user sees Steve Jobs is in the main header")
    public void user_sees_steve_jobs_is_in_the_main_header() {
        wikipediaSearchPageHomeWork.mainHeaderVerification("Steve Jobs");

    }

    @Then("user sees Steve Jobs is in the image header")
    public void userSeesSteveJobsIsInTheImageHeader() {
        Assert.assertTrue(wikipediaSearchPageHomeWork.jobImg.isDisplayed());

    }
}
