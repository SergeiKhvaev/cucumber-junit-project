package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikipediaSearchPageHomeWork {

    public WikipediaSearchPageHomeWork() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "input#searchInput")
    public WebElement searchBox;


    @FindBy(xpath = "//button[@class='pure-button pure-button-primary-progressive']")
    public WebElement submitBtn;

    @FindBy(css = "span.mw-page-title-main")
    public WebElement mainHeader;

    @FindBy(css = "img[alt='Steve Jobs Headshot 2010-CROP (cropped 2).jpg']")
    public WebElement jobImg;

    public void mainHeaderVerification(String expected) {
        String actualHeaderText = mainHeader.getText();
        Assert.assertEquals("Header not matched", expected, actualHeaderText);


    }

}
