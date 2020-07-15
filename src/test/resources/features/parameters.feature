Feature: Practice for regex parameterization

  @doublequoteparam
  Scenario: String parameters with double quotes
    When I read parameter "value1"
    Then I read parameter "value2"
    And I read parameter "value3"
    But I read parameter "value4 and value5"


  @outline
  Scenario Outline: String parameters with double quotes
    When I read parameter "<values>"
    Given I login with "<userID>" id and "<psswd>" password
    Given I pass double value into parameter <double>
    Given I pass integer value <integer>
    Examples:
      | values              | userID | psswd  | double |integer|
      | value1              | user1  | 1234   | 12.3   |1      |
      | value2              | user2  | 4566   | 2.43   |2      |
      | value3              | user3  | 456456 | 3.34   |3      |
      | value4 and valueABC | userMe | 12123  | 4.5353 |4      |


    @intparam
      Scenario: Integer parameter
      Given I pass integer value 123

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
    Then I select Slow from the speed drop down
    And I select Medium from the speed drop down




