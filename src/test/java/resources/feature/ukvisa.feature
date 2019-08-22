
Feature: Visa requirements
  As a user i can find visa requirements

  Background:
    Given     I am at home page
    When      I click on start button
    Then      I navigate to check Visa

  Scenario: User should know visa requirement

    Given    I provide a nationality of "Japan"
    And    I click Next
    And    I select the reason Study
    And    I click Next step
    And    I state I am intending to stay for more than six months
    When   I submit the form
    Then   I will be informed I need a visa to study in the UK

  Scenario: User should find what type of visa requirement

    Given  I provide a nationality of "Japan"
    And    I click Next
    And    I select the reason Tourism
    When   I submit the form
    Then   I will be informed I won’t need a visa to come to the UK

  Scenario: User should search what type of visa requirement

    Given  I provide a nationality of "Russia"
    And    I click Next
    And    I select the reason Tourism
    And    I click Next step
    And    I state I am travelling or staying with partner or family
    When   I submit the form
    Then   I will be informed I You’ll need a visa to come to the UK


