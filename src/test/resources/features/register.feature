@regression
Feature: Register Feature


@smoke
  Scenario: User should navigate to register page successfully
    Given I am on home page
    When I click on register link
    Then I should see the Register text"Register"

  @smoke
Scenario:verify that FirstName LastName Email Password And ConfirmPasswordFields Are Mandatory
  Given I am on home page
  When I click on register link
  And I click on Register Button
  Then I should see the erroe Messages

    @sanity
  Scenario: User should create account successfully
    Given I am on home page
    When I click on register link
    And I select gender "Female"
    And I enter first name
    And I enter last name
    And I enter emailaddress
    And I enter password
    And I enter confirm password
    And I click on the Register Button
    Then I should message "Your registration completed"




