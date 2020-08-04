Feature: To test features of OpenJS Org

  @readprop
  Scenario: To read properties
    Given I read property loginURL
    And I read property loginEmail
    Then I read property loginPass

  @setlogin
  Scenario: set login details
    Given I set email to "loginEmail"
    Then I set password to "loginPass"

  @setloginoutline
  Scenario Outline: set login details outline
    Given I set email to "<email>"
    Then I set password to "<password>"
    Examples:
      | email           | password |
      | email@gmail.com | pass123  |
      | email@yahoo.com | pass456  |
      | email@na.edu    | pass111  |


  @setloginexcel
    Scenario: set login details from excel
      Given I login with excel file
