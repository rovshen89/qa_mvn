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
      | values              | userID | psswd  | double | integer |
      | value1              | user1  | 1234   | 12.3   | 1       |
      | value2              | user2  | 4566   | 2.43   | 2       |
      | value3              | user3  | 456456 | 3.34   | 3       |
      | value4 and valueABC | userMe | 12123  | 4.5353 | 4       |


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

  @multiparam
  Scenario: Multi params with Map
    #Given I enter first name "firstNm" and last name "lastNm" and address line1 "abc street building 1"
    Given I fill signup form
      | first name    | myName             |
      | last name     | mylastName         |
      | address line1 | 100 some street    |
      | address line2 | 200 another street |
      | zip code      | 77477              |
      | city          | Stafford           |
      | State         | TX                 |
    Then I fill bankapplication form
      | bank name     | myBank             |
      | account name  | my Account         |
      | address line1 | 100 some street    |
      | address line2 | 200 another street |
      | zip code      | 77477              |
      | city          | Stafford           |
      | State         | TX                 |
    And I fill registration form
      | bank name     | myBank             |
      | account name  | my Account         |
      | address line1 | 100 some street    |
      | address line2 | 200 another street |
      | zip code      | 77477              |
      | city          | Stafford           |
      | State         | TX                 |


  @datatable
  Scenario: Datatable examples
    Given I fill all forms
      | first name | last name | address line1   | address line2 | zip code | City     | State | email           |
      | myName1    | myLastNm1 | 100 some street | Apt A         | 77477    | Stafford | TX    |                 |
      | myName2    | myLastNm2 | 101 some street |               | 77588    | New York | NY    | some2@email.com |
      | myName3    |           | 102 some street | Apt C         | 77699    | Seattle  | WA    | some3@email.com |
      | myName4    | myLastNm4 |                 | Apt D         | 77811    | Bostom   | MS    | some1@email.com |


  @datatable2
  Scenario Outline: Datatable examples
    Given I fill all forms on <Browser>

      | first name | last name | address line1   | address line2 | zip code | City     | State | email           |
      | myName1    | myLastNm1 | 100 some street | Apt A         | 77477    | Stafford | TX    |                 |
      | myName2    | myLastNm2 | 101 some street |               | 77588    | New York | NY    | some2@email.com |
      | myName3    |           | 102 some street | Apt C         | 77699    | Seattle  | WA    | some3@email.com |
      | myName4    | myLastNm4 |                 | Apt D         | 77811    | Bostom   | MS    | some1@email.com |
    Examples:
      | Browser |
      | chrome  |
      | firefox |
      | edge    |
