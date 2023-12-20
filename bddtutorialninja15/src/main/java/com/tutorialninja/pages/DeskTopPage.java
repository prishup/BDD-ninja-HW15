package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeskTopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DeskTopPage.class);

    public DeskTopPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/h2")
    WebElement desktoptext;

    public String getdesktoptext() {
        return getTextFromElement(desktoptext);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='form-group input-group input-group-sm']/select")
    WebElement sortorder;

    public void selectAtoZ() {
        selectByIndexFromDropDown(sortorder, 2);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='form-group input-group input-group-sm']/select")
    WebElement descendingorder;
    public void selectZtoA() {
        selectByIndexFromDropDown(descendingorder, 1);
    }

    // 2.4 Select product “HP LP3065”}
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'HP LP3065')]")
    WebElement productTextHPLP3065;
    public void clickOnProductHPLP3065(String productName) {
        clickOnElement(productTextHPLP3065);}
}