@Search
Feature: search functionality
  @Search @ProductSearch
  Scenario: Search a product
    Given user goes to homepage
    When user search for "mac"
    Then products name should contain "mac"
