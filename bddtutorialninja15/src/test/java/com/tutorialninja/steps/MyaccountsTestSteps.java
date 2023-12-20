package com.tutorialninja.steps;

import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.LoginPage;
import com.tutorialninja.pages.MyAccountPage;
import com.tutorialninja.pages.RegisterPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyaccountsTestSteps {
    @When("^I Click on My Account Link\\.$")
    public void iClickOnMyAccountLink() {
        new HomePage().clickOnAccount();
    }

    @And("^I click on register$")
    public void iClickOnRegister() {
        new RegisterPage().registerlink();
    }

    @And("^I enter details$")
    public void iEnterDetails() {
        new RegisterPage().registerDetails();
    }

    @And("^I select Subscribe Yes radio button$")
    public void iSelectSubscribeYesRadioButton() {
        new RegisterPage().clickOnRadioButton();
    }

    @And("^I Click on Privacy Policy check box$")
    public void iClickOnPrivacyPolicyCheckBox() {
        new RegisterPage().clickOnPrivacyPolicy();
    }

    @And("^I Click on Continue button$")
    public void iClickOnContinueButton() {
        new RegisterPage().clickOnContinueButton();
    }

    @And("^I Click again on Continue button$")
    public void iClickAgainOnContinueButton() {
        new MyAccountPage().clickOnContinue1();
    }

    @And("^I click on login$")
    public void iClickOnLogin() {
        new HomePage().loglink();
    }


    @And("^I Enter login dtails$")
    public void iEnterLoginDtails() {
        new LoginPage().loginDetails();
    }

    @And("^I Click on Login button$")
    public void iClickOnLoginButton() {
        new LoginPage().loginButton();
    }

    @And("^I click on logout$")
    public void iClickOnLogout() {
        new HomePage().logout();
    }

    @Then("^I Click on the Continue button$")
    public void iClickOnTheContinueButton() {
        new MyAccountPage().clickOnContinue2();
    }
}
