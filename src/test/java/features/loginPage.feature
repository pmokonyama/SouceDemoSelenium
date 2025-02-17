Feature: Saucedemo Login Feature

  Scenario: Validate user is able to view after log in
    Given User is on the Saucedemo login page
    When User logins with correct username and password
    Then User should be logged in




