#@controlgroup
Feature: ControlGroup tests

  @controlgroupheader
  Scenario: ControlGroup Header test
    Given I am on the jquery homepage
    Then I click on controlgroup
    Then I land on the controlgroup page
    Then I switch to demo-frame
    Then I validate header
    Then I click up arrow 5 times
    Then I validate that number of cars is 5
    Then I click down arrow 2 times
    Then I validate that number of cars is 3