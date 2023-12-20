Feature: laptopAndNotebookTest

  Scenario: verifyProductsPriceDisplayHighToLowSuccessfully
    Given I am on homepage
    And I mousehover on laptops and notebook and click
    And I click on showalldesktoplink
    And I select sort By "price (High >Low)'

  Scenario: verifyThatUserPlaceOrderSuccessfully
    Given I am on homepage
    And I mousehover on laptops and notebook and click
    And I click on showalllaptoplink
    And I select sort By "price (High >Low)'
    And Select Product “MacBook”
#      And Verify the text “MacBook”
    And I Click on ‘Add To Cart’ button
#    And I verify msg "“Success: You have modified your shopping cart!”
    And I Click on link “shopping cart” display into success message
    And I Verify the text "Shopping Cart"
    And I Verify the Product name "MacBook"
#    And I change quentity "2"
    And I click on update tab
#    And I Verify the message “Success: You have modified your shopping cart!”
#    And I Verify the Total "£737.45"
    And I Click on “Checkout” button
#    And Verify the Text “New Customer”
    And I Click on “Guest Checkout” radio button
    And Click on “Continue” tab
    And Fill the mandatory fields
    And Click on “Continue” Button
    And I Add Comments About your order into text area
    And I Check the Terms & Conditions check box
    And I Click on “Continue” button








