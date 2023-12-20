package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class);

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
    WebElement registerAccount;
    public void registerlink() {
        clickOnElement(registerAccount);
    }
//  3.3 Enter First Name
    @CacheLookup
    @FindBy(id ="input-firstname")
    WebElement firstName;
//3.4 Enter Last Name
@CacheLookup
@FindBy(id = "input-lastname")
WebElement lastName;
//3.5 Enter Email
@CacheLookup
@FindBy(id = "input-email")
WebElement email;
//3.6 Enter Telephone
@CacheLookup
@FindBy(id = "input-telephone")
WebElement telephoneNumber;

//3.7 Enter Password
@CacheLookup
@FindBy(id = "input-password")
WebElement passwordField;
//3.8 Enter Password Confirm
@CacheLookup
@FindBy(id = "input-confirm")
WebElement confirmPasswordField;
    public void registerDetails() {

       sendTextToElement(firstName,"kinja");
        sendTextToElement(lastName,"shah");
        sendTextToElement(email,"kin1581@yahoo.com");
        sendTextToElement(telephoneNumber,"258964785");
        sendTextToElement(passwordField,"123456");
        sendTextToElement(confirmPasswordField,"123456");
    }
//    3.9 Select Subscribe Yes radio button
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/form/fieldset[3]/div/div/label[1]/input")
    WebElement clickOnRadio;
    public void clickOnRadioButton(){
        clickOnElement(clickOnRadio);
    }
    //    3.10 Click on Privacy Policy check box
    @CacheLookup
    @FindBy(xpath = "//div[@class='buttons']/div/input[1]")
    WebElement clickOnPrivacy;
    public void clickOnPrivacyPolicy(){
        clickOnElement(clickOnPrivacy);
    }

    //    3.11 Click on Continue button@CacheLookup
    @FindBy(xpath = "//div[@class='buttons']/div/input[2]")
    WebElement clickOnCntinue;
    public void clickOnContinueButton(){
        clickOnElement(clickOnCntinue);
    }

}
