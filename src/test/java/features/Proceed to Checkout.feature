Feature: Proceed to Checkout

  Scenario: Proceed to checkout
    Given User is on the Cart page
    And User sees the selected item
    When User checks out
    Then User should be on "Checkout: Your Information" page
