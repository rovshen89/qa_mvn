Feature: Practice for regex parameterization

  @doublequoteparam
  Scenario: String parameters with double quotes
    When I read parameter "value1"
    Then I read parameter "value2"
    And I read parameter "value3"
    But I read parameter "value4 and value5"

  @usercredentials
  Scenario: Multiple string params
    Given I login with "user1" id and "password1" password
    Then I land on homepage "Jquery"

  @doublequoteparam1
  Scenario: String parameters with double quotes2
    Given I sign up with user name "testUser1" and email "user@email.com"


  @word_and_digit_param
  Scenario: String parameter with continuous words without spaces and double quotes
    Given I login with id user2 and passId 12345

  @doublevalue
  Scenario: Double digit parameter
    Given I pass double value into parameter 123.4567

  @limitedparams
  Scenario: Limiting parameter values
    Given I select Faster from the speed drop down




