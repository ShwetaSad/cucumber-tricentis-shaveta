@regression
Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @smoke
  Scenario: User should navigate to login page successfully
    Given I am on the home page
    When I click on the login link
    Then I should see the message "Welcome, Please Sign In!"

  @sanity
  Scenario: User should log in successfully with valid credentials
    Given I am on the home page
    When I click on the login link
    And I enter email "sethis@gmail.com"
    And I enter password "Sethi123"
    And I click on login button
    Then I should log in successfully
@sanity
  Scenario: User should log in successfully with invalid credentials
    Given I am on the home page
    When I click on the login link
    And I enter email "sethis@gmail.com"
    And I enter password "abc22123"
    And I click on login button
    Then I should see the error message

  Scenario: User should log out successfully
    Given I am on the home page
    When I click on the login link
    And I enter email "sethis@gmail.com"
    And I enter password "Sethi123"
    And I click on login button
    And I click on logout link
    Then I should see the login link display

