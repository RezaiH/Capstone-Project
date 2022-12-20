Feature: Sign In Feature

  @signInIntoApp 
  Scenario: Verify user can sign in into Retail Application
    Given User is on Retail website
    When User click on Sign in option
    And User enter email 'hussain@gmail.com' and password 'Hussain@17'
    And User click on login button
    Then User should be logged in into the Account

  @createAccount 
  Scenario: Verify user can create an account into Retail Website
    Given User is on Retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp form with below data
      | name     | email                     | password  | confirmPassword |
      | panthers | panthers05@tekschool.us | Tek@12345 | Tek@12345       |
    And User click on SignUp button
    Then User should be logged into account page
