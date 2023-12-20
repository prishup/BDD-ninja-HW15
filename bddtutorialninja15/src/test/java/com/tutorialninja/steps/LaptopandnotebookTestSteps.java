package com.tutorialninja.steps;

import com.tutorialninja.pages.CheckoutPage;
import com.tutorialninja.pages.LaptopandNotebooksPage;
import com.tutorialninja.pages.MacbookPage;
import com.tutorialninja.pages.ShoppingCartPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.testng.Assert;

public class LaptopandnotebookTestSteps {
    @And("^I select sort By \"price \\(High >Low\\)'$")
    public void iSelectSortByPriceHighLow() {
        new LaptopandNotebooksPage().selectPrice();
    }

    @And("^Select Product “MacBook”$")
    public void selectProductMacBook() {
        new LaptopandNotebooksPage().clickMacbook();
    }
    @And("^I Click on ‘Add To Cart’ button$")
    public void iClickOnAddToCartButton() {
        new MacbookPage().clickOnAddToCart();
    }
    @And("^I Click on link “shopping cart” display into success message$")
    public void iClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new MacbookPage().clickOnLinkToShoppingCartMessage();
    }

    @And("^I Verify the text \"([^\"]*)\"$")
    public void iVerifyTheText(String text5) {
        String actualText = new ShoppingCartPage().verifyTextForShoppingCart();
        Assert.assertEquals(text5,actualText,"validating ShoppingCart Text");
    }

    @And("^I Verify the Product name \"([^\"]*)\"$")
    public void iVerifyTheProductName(String text6) {
      String actualText1 = new ShoppingCartPage().verifyMacbookText();
      Assert.assertEquals(text6,actualText1,"validating macbook text");
    }

    @And("^I (\\d+)\\.(\\d+) Change Quantity \"([^\"]*)\"$")
    public void iChangeQuantity(int arg0, int arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I change quentity \"([^\"]*)\"$")
    public void iChangeQuentity() {
        new ShoppingCartPage().clearTheQtyBox();

    }

    @And("^I click on update tab$")
    public void iClickOnUpdateTab() {
        new ShoppingCartPage().clickOnCart();
    }



    @And("^I Verify the message “Success: You have modified your shopping cart!”$")
    public void iVerifyTheMessageSuccessYouHaveModifiedYourShoppingCart(String text6) {
        String actualText3 = new ShoppingCartPage().verifyMacbookText();
        Assert.assertEquals(text6,actualText3,"validating macbook text");

    }
    @And("^I Verify the Total \"([^\"]*)\"$")
    public void iVerifyTheTotal(String total){
        String actualText4 = new ShoppingCartPage().verifyingTotal();
        Assert.assertEquals(total,actualText4,"validating the total");
    }

    @And("^I Click on “Checkout” button$")
    public void iClickOnCheckoutButton() {
        new ShoppingCartPage().clickOnCheckoutButton();
    }


    @And("^I Click on “Guest Checkout” radio button$")
    public void iClickOnGuestCheckoutRadioButton() {
        new CheckoutPage().clickingRadioButton();
    }

    @And("^Click on “Continue” tab$")
    public void clickOnContinueTab() {
        new CheckoutPage().clickingContinue();
    }

    @And("^Fill the mandatory fields$")
    public void fillTheMandatoryFields() throws InterruptedException {
       new CheckoutPage().enterMandatoryField();
    }

    @And("^Click on “Continue” Button$")
    public void clickOnContinueButton() {
        new CheckoutPage().clickOnButton();
    }

    @And("^I Add Comments About your order into text area$")
    public void iAddCommentsAboutYourOrderIntoTextArea() {
        new CheckoutPage().comment();
    }

    @And("^I Check the Terms & Conditions check box$")
    public void iCheckTheTermsConditionsCheckBox() {
        new CheckoutPage().clickBoxOnTermsAndCondition();
    }

    @And("^I Click on “Continue” button$")
    public void iClickOnContinueButton() {
        new CheckoutPage().clickOnContinueButtonForPaymentMethod();
    }
}