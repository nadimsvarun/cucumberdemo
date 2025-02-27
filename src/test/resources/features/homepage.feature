@Scenariooutline
Feature: Check demo bank website

  Background:
    Given User launches banking demo website url
    When User clicks on Register

  Scenario Outline:  Signup multiple users
    Then  User enters "<First Name>" on the sign up form
    And   User enters "<Last Name>" lastname
    And   User enters "<Address>" address
    And   User enters "<City>" city
    And   User enters "<State>" state
    And   User enters "<Zip Code>" zipcode
    And   User enters "<Phone #>" phoneno
    And   User enters "<SSN>" ssn
    And   User enters "<Username>" username
    And   User enters "<Password>" password
    And   User enters "<Confirm Password>" confirmpassword
    Then  User clicks on Register button
    And   User logs out
    Examples:
      | First Name | Last Name | Address   | City   | State | Zip Code | Phone # | SSN | Username | Password | Confirm Password|
      | Mark       | ron      | 11th street| Ca     | SF    | 1111      | 123456 | 2222 | marktest   | marktest123  | marktest123|
      | Wilson     | sam      | 11th street| Ca     | SF    | 1111      | 123456 | 2222 | wilsontest  | wilsontest123 | wilsontest123|
