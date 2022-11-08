package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsySearch {

    public EtsySearch(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = "input[id='global-enhancements-search-query']")
    public WebElement searchBox;

    @FindBy(css = "span[class='wt-icon wt-nudge-b-2 wt-nudge-r-1']")
    public WebElement searchBtn;

}
