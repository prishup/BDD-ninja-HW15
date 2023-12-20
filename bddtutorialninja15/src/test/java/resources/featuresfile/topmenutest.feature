Feature: topmenutest

  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
    Given I am on homepage
    When  I mousehover on desktop and click
    And I click on showalldesktoplink
    Then I verify text "Desktops"

    Scenario: verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully
      Given I am on homepage
      When  I mousehover on laptops and notebook and click
      And I click on showalllaptoplink
      Then I verify  the text "Laptops & Notebooks"

  Scenario: verifyUserShouldNavigateToComponentsPageSuccessfully
    Given I am on homepage
    When  I mousehover on Components and click
    And I click on showallComponents
    Then I verify msg "Components"



