Feature: Saucedemo Login Feature

  Scenario: Validate user is able to view after log in
    Given User is on the Saucedemo login page
    When User logins with correct username {string} and password {string}
    Then User should be logged in


#@login
#Feature: Login
#
#  Scenario Outline: As an existing user i want to login successfully
#    Given I am in the login page
#    And I enter username <username>
#    And I enter password <password>
#    When I click login button
#    Then The home page is displayed
#    Examples:
#      | username                | password     |
#      | standard_user           | secret_sauce |
##      | problem_user            | secret_sauce |
##      | performance_glitch_user | secret_sauce |    