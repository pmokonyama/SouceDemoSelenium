Feature: Confirm Purchase

Scenario: Complete checkout and confirm purchase
Given User is on the "Checkout: Your Information" page
When User fills in shipping details
And User clicks the "Continue" button
Then User should be on "Checkout: Overview" page
And User sees the selected item
And User clicks the "Finish" button
Then User should see the "Thank you for your order!" message