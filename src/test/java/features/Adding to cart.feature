Feature: Adding to cart

  Scenario: Validate user can add an item to the cart
    Given User is on the Products page
    When User selects second item on the product list
    And The cart icon should show 1 item
    And Varify user is on the correct page "Your Cart"
    And Varify user selected the correct product
    Then User clicks the continue shopping button



