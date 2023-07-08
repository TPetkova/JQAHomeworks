Feature: User is able to login and logout on the "https://www.saucedemo.com/" page
  In order to use the website functionalities
  As a user
  I want to be able to login and logout on the website

  @smoke
  Scenario: 1. Successful login of a user
  Given a user is on the "https://www.saucedemo.com/" page
  And the user enter a valid username "standard_user"
  And the user enter a valid password "secret_sauce"
  When the user clicks "Login" button
  Then the user is redirected to the Home page

  @smoke
  Scenario: 2. Successful logout of a user
    Given a user is on the Home page
    And the user clicks menu button
    And there is logout option
    When the user clicks logout option
    Then the user is logged out
