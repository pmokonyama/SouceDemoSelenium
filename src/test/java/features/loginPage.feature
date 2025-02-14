Feature: Saucedemo Login Feature

  Scenario: Validate user is able to view after log in
    Given User is on the Saucedemo login page
    When User logins with correct username {string} and password {string}
    Then User should be logged in