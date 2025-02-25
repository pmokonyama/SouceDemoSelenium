Feature: Adding to cart

  Scenario Outline: Validate user is able to view after log in
    Given User is on the Saucedemo login page
    When User logins with correct "<username>" and "<password>"
    Then User should be logged in
    Given User is on the Products page
    When User selects second item on the product list
    And Clicks the cart button when the item appears in the cart icon
    And Verify, user is on the correct page
    And Verify user selected the correct product
    Then The user is redirected to the Products page
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

  #Scenario: Validate user can add an item to the cart






