Feature: DesktopsTest

  Scenario:verifyProductArrangeInAlphaBaticalOrder
    Given I am on homepage
    When  I mousehover on desktop and click
    And I click on showalldesktoplink
    And I select sort By position Name Z to A
#    Then I verify Product will arrange "Name Z to A"

  Scenario: verifyProductAddedToShoppingCartSuccessFully
    Given I am on homepage
    When  I mousehover on desktop and click
    And I Select Sort By position Name A to Z
    And I select product "HP LP3065"
#    And Select Delivery Date 2022-11-30

#    And I enter Qty "1" using Select class.
#    And click on Add to cart button.
#    And click on link "shopping cart" display into success message







