@Datatable
Feature: Bill Payment

  Scenario: Signup
    Given User launches banking demo website url
    When  User clicks on Register
    Then  User enters data into all fields in signup
      | FirstName | LastName | Address     | City   | State | ZipCode   | Phone  | SSN  | Username   | Password     | ConfirmPassword|
      | james     | vaun      | 11th street| Ca     | SF    | 1111      | 123456 | 2222 | jamestest  | jamestest123 | jamestest123   |
    And   User clicks on Register button



  Scenario: Bill Payment
    Given User launches banking demo website url
    When  User clicks on Register
    Then  User enters data into all fields in signup
      | FirstName | LastName | Address     | City   | State | ZipCode   | Phone  | SSN  | Username   | Password     | ConfirmPassword|
      | David     | vaun      | 11th street| Ca     | SF    | 1111      | 123456 | 2222 | davidtest  | davidtest123 | davidtest123   |
    And   User clicks on Register button
    Then User is on dashboard page
    When User clicks on Bill Pay
    Then User enters Payee details
    |name|address|city|state|zipcode|phone|account|verifyaccount|amount|fromaccount|
    |Brian|11th cross|sanjose|ca|1111|2222|123456 |123456       |10000 |22222      |
    And User clicks on Send Payment
    And User logs out


