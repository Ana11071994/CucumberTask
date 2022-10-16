Feature: To validate login functionality of fb application

  Background: 
    Given user need to be in login page
    @confidence

  Scenario Outline: To validate login with invalid username and password
    When user should enter invalid "<username>" and "<invalid password>"
    And user should click login button
    Then user will navigate to invalid credential page

    Examples: 
      | username  | password |
      | ana@123   | ana      |
      | anand@123 | anand    |
      | Java@123  | java     |
      @humble

  Scenario: to validate login with empty username and password
    When user clicks login button
    Then user will redirect to invalid credential page
