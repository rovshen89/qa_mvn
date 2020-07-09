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

