package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class);
    public MyAccountPage() {
        PageFactory.initElements(driver, this);
    }
//    3.17 Click on Continue button
@CacheLookup
@FindBy(xpath = "//div[@class='pull-right']/a")
WebElement click;
    public void clickOnContinue1(){
        clickOnElement(click);
    }
    //login link
//    @CacheLookup
//    @FindBy(linkText = "Login")
//    WebElement login;
//    public void setLogin(){
//        clickOnElement(login);
//    }

//    @CacheLookup
//    @FindBy(linkText = "Logout")
//    WebElement logout;
//    public void setLogout(){
//        clickOnElement(logout);
@CacheLookup
@FindBy(xpath = "//div[@id=\"content\"]/div/div/a")
WebElement continue1;
    public void clickOnContinue2(){
        clickOnElement(continue1);
    }
}

