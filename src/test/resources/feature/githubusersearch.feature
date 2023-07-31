Feature: User Search

  Scenario Outline: Search for a user with the name "<name>"
    Given I am on the user search page
    And I enter the name "<name>" in the search field
    When I click the search button
    Then I should see a list of users with the name "<name>"
    Examples:
      |name  |
    |Smith      |
