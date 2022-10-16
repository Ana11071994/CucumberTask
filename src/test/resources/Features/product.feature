Feature: To validate search funtionality of flipkart application
@confidence
  Scenario: To  validate searchbox with product name
    Given user needs to be in flipkart homepage
    When user should enter product name in searchbox
      | product     | New product |
      | iphone      | mac laptop  |
      | smart watch | tshirt      |
    And user should click search button
    Then user will navigaye to products page
