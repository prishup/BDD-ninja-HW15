package com.tutorialninja.steps;

import com.tutorialninja.pages.ComponentsPage;
import com.tutorialninja.pages.DeskTopPage;
import com.tutorialninja.pages.HomePage;
import com.tutorialninja.pages.LaptopandNotebooksPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class TopMenuTestSteps {

    @When("^I mousehover on desktop and click$")
    public void iMousehoverOnDesktopAndClick() {
        new HomePage().clickOnDesktopclick();

    }

    @And("^I click on showalldesktoplink$")
    public void iClickOnShowalldesktoplink() {
    }

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @Then("^I verify text \"([^\"]*)\"$")
    public void iVerifyText(String text)  {
        String getdesktoptext = new DeskTopPage().getdesktoptext();
        Assert.assertEquals(text,getdesktoptext,"Validating Desktops Text");
    }

    @When("^I mousehover on laptops and notebook and click$")
    public void iMousehoverOnLaptopsAndNotebookAndClick() {
        new HomePage().clickonlaptopsandnotebooks();
    }
    @And("^I click on showalllaptoplink$")
    public void iClickOnShowalllaptoplink() {
    }

    @Then("^I verify  the text \"([^\"]*)\"$")
    public void iVerifyTheText(String text1) {
     String actualText = new LaptopandNotebooksPage().actualresult();
        Assert.assertEquals(text1,actualText,"Validating Desktops Text");
    }
    @When("^I mousehover on Components and click$")
    public void iMousehoverOnComponentsAndClick() {
        new HomePage().clickOnCoponents();

    }
    @And("^I click on showallComponents$")
    public void iClickOnShowallComponents() {

    }

    @Then("^I verify msg \"([^\"]*)\"$")
    public void iVerifyMsg(String msg) {
        String cmponentsText = new ComponentsPage().cmponentsText();
        Assert.assertEquals(msg,cmponentsText,"Validating Component Text");


    }


//    @Then("^I verify Text(\\d+) \"([^\"]*)\"$")
//    public void iVerifyText(String text2) {
//        String cmponentsText = new ComponentsPage().cmponentsText();
//        Assert.assertEquals(text2,cmponentsText,"Validating component Text");
//    }

//    @Then("^I verify  text \"([^\"]*)\"$")
//    public void iVerifyText(String text2) {
//        String cmponentsText = new ComponentsPage().cmponentsText();
//        Assert.assertEquals(text2,cmponentsText,"Validating Components Text");
//    }
}
