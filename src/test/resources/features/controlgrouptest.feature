Feature: ControlGroup tests

  @controlgroupheader
  Scenario: ControlGroup Header test
    Given I am on the jquery homepage
    Then I click on controlgroup
    Then I switch to demo-frame
    Then I validate header