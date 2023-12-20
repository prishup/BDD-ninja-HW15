package com.tutorialninja.steps;

import com.tutorialninja.pages.DeskTopPage;
import cucumber.api.java.en.And;

public class DesktopTestSteps {
    @And("^I select sort By position Name Z to A$")
    public void iSelectSortByPositionNameZToA() {
      new DeskTopPage().selectAtoZ();
    }

    @And("^I Select Sort By position Name A to Z$")
    public void iSelectSortByPositionNameAToZ() {
        new DeskTopPage().selectZtoA();
    }



    @And("^I select product \"([^\"]*)\"$")
    public void iSelectProduct(String productName) {
        new DeskTopPage().clickOnProductHPLP3065(productName);
    }
}

