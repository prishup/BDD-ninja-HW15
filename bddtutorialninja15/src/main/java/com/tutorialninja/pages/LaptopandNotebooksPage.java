package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LaptopandNotebooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);

    public LaptopandNotebooksPage() {
        PageFactory.initElements(driver, this);
    }
@CacheLookup
    @FindBy(tagName = "h2")
    WebElement laptopsandnotebooktext;
    public String actualresult(){
        return getTextFromElement(laptopsandnotebooktext);
    }
    //1.3 Select Sort By "Price (High > Low)"
    @CacheLookup
            @FindBy(id = "input-sort")
            WebElement sortorder1;
    public void selectPrice(){
        selectByIndexFromDropDown(sortorder1,4);
    }

//2.4 Select Product “MacBook”
    @CacheLookup
        @FindBy(xpath = "//div[@id='content']/div[4]/div[4]/div/div[2]/div[1]/h4/a")
    WebElement selectMacbook;
    public void clickMacbook(){
        clickOnElement(selectMacbook);
    }



}
