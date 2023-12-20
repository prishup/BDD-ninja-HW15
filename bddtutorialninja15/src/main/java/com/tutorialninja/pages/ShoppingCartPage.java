package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(DeskTopPage.class);

    //    2.11 Verify the text "Shopping Cart"
    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id=\"top-links\"]/ul/li[4]/a")
    WebElement checkTextShoppingCart;

    public String verifyTextForShoppingCart() {
        return getTextFromElement(checkTextShoppingCart);
    }

    //verify macbook text
    @CacheLookup
    @FindBy(xpath = "//div[@id=\"content\"]/form/div/table/tbody/tr/td[2]/a")
    WebElement macbookText;

    public String verifyMacbookText() {
        return getTextFromElement(macbookText);
    }
//    Change Quantity "2"

    @CacheLookup
    @FindBy(xpath = "//div[@class='table-responsive']/table[1]/tbody/tr/td[4]/div[1]/input[1]")
    WebElement changeQuantity;
    public void clearTheQtyBox() {
        clearTextFromField(By.xpath("//div[@class='table-responsive']/table[1]/tbody/tr/td[4]/div[1]/input[1]"));
       sendTextToElement(changeQuantity,"2");
    }




    //  2.12 Click on “Update” Tab
    @CacheLookup
    @FindBy(xpath = "//div[@class='input-group btn-block']/span[1]/button[1]")
    WebElement updateTab;

    public void clickOnCart() {
        clickOnElement(updateTab);
    }

    //2.13 Verify the message “Success: You have modified your shopping cart!”
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement verifyMessageSuccess;

    public String modifiedMesaage() {
        return getTextFromElement(verifyMessageSuccess);
    }

    // 2.14 Verify the Total £737.45
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[2]/div/table/tbody/tr[4]/td[2]")
    WebElement verifyTotal;

    public String verifyingTotal() {
        return getTextFromElement(verifyTotal);
    }

    //    2.15 Click on “Checkout” button
    @CacheLookup
    @FindBy(xpath = "//div[@id='content']/div[3]/div[2]/a")
    WebElement clickOnCheckout;

    public void clickOnCheckoutButton() {
        clickOnElement(clickOnCheckout);
    }

}
