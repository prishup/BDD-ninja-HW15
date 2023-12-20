package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutPage.class);

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    //        2.18 Click on “Guest Checkout” radio button
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[1]/div[2]/div/div/div[1]/div[2]/label/input")
    WebElement clickOnRadio;

    public void clickingRadioButton() {
        clickOnElement(clickOnRadio);
    }

    //        2.19 Click on “Continue” tab
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement clickOnContinue;

    public void clickingContinue() {
        clickOnElement(clickOnContinue);
    }

    // Fill the mandatoty field
    @CacheLookup
    @FindBy(id ="input-payment-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id ="input-payment-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id ="input-payment-email")
    WebElement email;
    @CacheLookup
    @FindBy(id ="input-payment-telephone")
    WebElement telephone;
    @CacheLookup
    @FindBy(id ="input-payment-address-1")
    WebElement address;
    @CacheLookup
    @FindBy(id ="input-payment-city")
    WebElement cityName;
    @CacheLookup
    @FindBy(name ="postcode")
    WebElement zipcode;
    @CacheLookup
    @FindBy(id ="input-payment-country")
    WebElement countryName;
    @CacheLookup
    @FindBy(xpath = "//select[@id=\"input-payment-zone\"]")
    WebElement zoneName;
    public void enterMandatoryField() throws InterruptedException {
        sendTextToElement(firstName,"kinja");
        sendTextToElement(lastName,"sha");
        sendTextToElement(email,"kinja10@yahoo.com");
        sendTextToElement(telephone,"1245789612");
        sendTextToElement(address,"fekjrhijeirjoithj");
        sendTextToElement(cityName,"London");
        sendTextToElement(zipcode,"ha0gh7");
        selectByIndexFromDropDown(countryName,18);
        Thread.sleep(3000);
        selectByIndexFromDropDown(zoneName,10);
    }
    //        2.21 Click on “Continue” Button
    @CacheLookup
    @FindBy(xpath = "//input[@id=\"button-guest\"]")
    WebElement clickOnButton;
    public void clickOnButton(){
        clickOnElement(clickOnButton);
    }
    //        2.22 Add Comments About your order into text area
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[3]/div[2]/div[1]/p[2]/textarea")
    WebElement addComments;
    public void comment(){
        sendTextToElement(addComments,"Pack nicely");
    }
    //        2.23 Check the Terms & Conditions check box
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div/div[3]/div[2]/div/div[2]/div/input[1]")
    WebElement termsAndCondition;
    public void clickBoxOnTermsAndCondition(){
        clickOnElement(termsAndCondition);
    }
//        2.24 Click on “Continue” button
@CacheLookup
@FindBy(xpath = "//input[@id='button-payment-method']")
WebElement continueButtonForPayment;
    public void clickOnContinueButtonForPaymentMethod() {
        clickOnElement(continueButtonForPayment);
    }


}