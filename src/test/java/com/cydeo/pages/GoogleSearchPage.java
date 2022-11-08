package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
   /*1.  User is on Google search page
#2.  User types apple in the google search box and clicks enter
#3.  User sees apple – Google Search is in the google title
#Note: Follow POM

    */


    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (name = "q")
    public WebElement searchBox;

}
