@Scenariooutline
Feature: Register with data from xml

  Background:
    Given User launches banking demo website url
    When User clicks on Register
  Scenario Outline:  Signup multiple users through data from xml
    Then User enters the data into fields from xml file with dataset <Number>
    And  User clicks on Register button
    And   User logs out
    Examples:
      |Number|
      |0     |
      |1     |


