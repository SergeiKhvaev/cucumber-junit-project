package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPractice_StepDefinitions {
    DropdownsPage dropdownsPage = new DropdownsPage();

    @Given("User is on the dropdowns page of practice tool")
    public void user_is_on_the_dropdowns_page_of_practice_tool() {
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }

    @Then("User should see below info in month dropdown")
    public void user_should_see_below_info_in_month_dropdown(List<String> expectedMonths) { // io.cucumber.datatable.DataTable dataTable convert it to needed data structure/ map. List<String> expectedMonths - we keep here axpected list of data

        /*Select select = new Select(dropdownsPage.monthDropdown);// call object from Select class to hande select dropdown
        List<WebElement> actualOptionsAsWebElement = select.getOptions(); // store all options from selected dropdown

        List <String> actualOptionsAsString = new ArrayList<>();

        for( WebElement eachElement : actualOptionsAsWebElement){
            actualOptionsAsString.add(eachElement.getText());
        }
         */

        // we just interchanged all above line of code by one line of Browser util method
        List <String> actualOptionsAsString = BrowserUtils.dropdownOptionAsString(dropdownsPage.monthDropdown);


// this assertion cheks sizes of given lists first, if it matched secondary it will check contents of list, each element one by one
        Assert.assertEquals("Not MATCHED", expectedMonths, actualOptionsAsString);


    }
}