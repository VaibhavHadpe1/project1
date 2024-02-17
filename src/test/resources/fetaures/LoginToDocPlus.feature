@run
  Feature: Login scenarios

    Scenario: Valid user login
      Given I am on the login page
      When I enter valid username "user123" and password "password123"
      And I click on the login button
      Then I should be logged in successfully