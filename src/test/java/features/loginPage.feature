Feature: Saucedemo Login Feature

  Scenario Outline: Validate user is able to view after log in
    Given User is on the Saucedemo login page
    When User logins with correct "<username>" and "<password>"
    Then User should be logged in
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
#      | problem_user            | secret_sauce |
#      | performance_glitch_user | secret_sauce |

