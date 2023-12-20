package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]/a")
    WebElement desktop;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[1]/div/a")
    WebElement showAllDeskTop;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[2]/a")
    WebElement laptopsAndNotebooksLinks;

    @CacheLookup
    @FindBy(xpath = "//ul[@class=\"nav navbar-nav\"]/li[2]/div/a")
    WebElement showAllLaptopAndNotebook;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[3]/a")
    WebElement components;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li[3]/div/a")
    WebElement showAllComonents;

    public void clickOnDesktopclick() {
        mouseHoverToElementAndClick(desktop);
        clickOnElement(showAllDeskTop);
    }
    // 2.1 Mouse hover on “Laptops & Notebooks” Tab and click
    public void clickonlaptopsandnotebooks() {
        mouseHoverToElementAndClick(laptopsAndNotebooksLinks);
        clickOnElement(showAllLaptopAndNotebook);
    }
    //    3.1 Mouse hover on “Components” Tab and click
    public void clickOnCoponents() {
        mouseHoverToElementAndClick(components);
        clickOnElement(showAllComonents);
    }
    // 1.1 Click on My Account Link.
    @CacheLookup
    @FindBy(xpath = "//nav[@id='top']/div[1]/div[2]/ul/li[2]")
    WebElement clickOnAccountButton;
    public void clickOnAccount(){
        clickOnElement(clickOnAccountButton);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    WebElement login;
    public void loglink() {
        clickOnElement(login);
    }
    @CacheLookup
    @FindBy(xpath = "//ul[@class=\"dropdown-menu dropdown-menu-right\"]/li[5]/a")
    WebElement logout;
    public void logout() {
        clickOnElement(logout);
    }
}


