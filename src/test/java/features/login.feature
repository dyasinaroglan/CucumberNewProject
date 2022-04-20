Feature: Login feature of Automation Practice
  User has to login sucessfully with valid credentials and see validation messages for invalid credentials

  Background:
    Given user is on homepage
    When User click SignIn link
    Then User should be able to navigate to Authentication page
    And User should see SignIn Panel

  Scenario: Verify user can login suceesfully with valid credentials
    Given User enter Email address as "yasinargln264@gmail.com" , password as "Yasin.264"
    And click SIgnIn button
    Then User should loggedIn sucessfully
    And User should be on My Account page

  Scenario Outline: Verify that user an see validation message for invalid credentials
    When User enter Email address "<email>", password "<password>"
    And click SIgnIn button
    Then User should see validation message as "<errormessage>"
    Examples:
      | email            | password    | errormessage               |
      |                  |             | An email address required. |
      |                  | password123 | An email address required. |
      | anitha@gmail.com | password23  | Authentication failed.     |
      | ani              | password345 | Invalid email address.     |
      | ani1@gmail.com   |             | Password is required.      |