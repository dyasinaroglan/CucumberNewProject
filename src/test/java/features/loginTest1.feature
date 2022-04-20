Feature: Login tests
  As Customer YASİN, I can login to Bhinneka.com

  Background: Home page of bhinneka.com
    Given go to site "https://www.bhinneka.com/"

  Scenario: Login to Bhinneka.com using valid account that registered in personal and corporate account type
    And login button click
    And Login page is displayed
    When Input credentials to login with headers table "yasinargln264@gmail.com"
    And selanjutnya button click

    Scenario Outline: search without login
      Given Home page is displayed
      When Input data with "<productName>" in search bar
      Then view wanted products
      Examples:
      | productName |
      | samsung |
      | apple |