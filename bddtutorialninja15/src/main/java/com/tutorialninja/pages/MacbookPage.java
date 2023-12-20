package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MacbookPage extends Utility {
    private static final Logger log = LogManager.getLogger(MacbookPage.class);
    public MacbookPage() {
        PageFactory.initElements(driver, this);}
    //2.6 Click on ‘Add To Cart’ button
    @CacheLookup
    @FindBy(id ="button-cart" )
    WebElement addToCart;
    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }
    // 2.8	Click on link “shopping cart” display into success message
    @CacheLookup
    @FindBy(xpath = "//ul[@class='list-inline']/li[4]/a")
    WebElement linkToShoppingCartInsideMessage;
    public void clickOnLinkToShoppingCartMessage() {
        clickOnElement(linkToShoppingCartInsideMessage);
}}



