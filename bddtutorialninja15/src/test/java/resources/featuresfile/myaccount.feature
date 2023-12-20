Feature: myaccount

  Scenario:verifyUserShouldNavigateToRegisterPageSuccessfully
    Given I am on homepage
    When I Click on My Account Link.
    Then I click on register

  Scenario: verifyUserShouldNavigateToLoginPageSuccessfully
    Given I am on homepage
    When I Click on My Account Link.
    And I click on register
#   Then I Verify the text “Returning Customer”.

  Scenario: verifyThatUserRegisterAccountSuccessfully
    Given I am on homepage
    When I Click on My Account Link.
    And I click on register
    And I enter details
    And I select Subscribe Yes radio button
    And I Click on Privacy Policy check box
    And I Click on Continue button
   And I Click again on Continue button

    Scenario: verifyThatUserShouldLoginAndLogoutSuccessfully
      When I Click on My Account Link.
      And I click on login
      And I Enter login dtails
      And I Click on Login button
     And I Click on My Account Link.
      And I click on logout
#      And I verify text logout
  Then I Click on the Continue button






