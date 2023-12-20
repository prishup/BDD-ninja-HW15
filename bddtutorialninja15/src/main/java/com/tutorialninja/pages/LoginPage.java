package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class);

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }
    //enter email address
    @CacheLookup
    @FindBy(id ="input-email" )
    WebElement email;
    @CacheLookup
    @FindBy(id ="input-password" )
    WebElement password;

    public void loginDetails(){
       sendTextToElement(email,"kin1581@yahoo.com");
       sendTextToElement(password,"123456");
    }
    //click on login button
    @CacheLookup
    @FindBy(xpath="//div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]" )
    WebElement clickOnLogin;
    public void loginButton(){
        clickOnElement(clickOnLogin);
    }
}

