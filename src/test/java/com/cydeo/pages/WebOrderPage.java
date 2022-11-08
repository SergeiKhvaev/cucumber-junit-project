package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WebOrderPage extends BasePage {

    public WebOrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//select[@name='product']")
    public WebElement dropdownProduct;


    @FindBy(css = "input[name='quantity']")
    public WebElement quantityInput;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement customerNameInput;

    @FindBy(css = "input[name='street']")
    public WebElement streetInput;

    //@FindAll() annotation we use to locete the same WebElement, but with different locators, we need it in case if one of locator does not working, so we test use another type of locator do find element

    @FindBy(name = "city")
    public WebElement cityInput;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateInput;

    @FindBy(css = "input[name='zip']")
    public WebElement zipInput;

    @FindBy(css = "input[name='card']")
    public List<WebElement> creditCardType;

    @FindBy(name = "cardNo")
    public WebElement cardNumberInput;

    @FindBy(name = "cardExp")
    public WebElement cardExpDate;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement submitBtn;

@FindBy(xpath = "//label[@class='radio']")
public List<WebElement> creditCardType2;



    public void creditCardSelection(String typeOfCard) {
        for (WebElement eachElement : creditCardType2) {
            if (eachElement.getText().equalsIgnoreCase(typeOfCard)) {
                eachElement.click();
            } // we can put that method in browser utils

        }
    }

    @FindBy(css = "input[placeholder='Enter the price for an individual unit']")
    public WebElement pricePerItem;

}
