Feature: Adding to cart

  Scenario Outline: Validate user is able to view after log in
    Given User is on the Saucedemo login page
    When User logins with correct "<username>" and "<password>"
    Then User should be logged in
    Given User is on the Products page
    When User selects second item on the product list
    And The cart icon should show item
    And Verify, user is on the correct page Your Cart
    And Verify user selected the correct product
    Then User clicks the continue shopping button
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario: Validate user can add an item to the cart






