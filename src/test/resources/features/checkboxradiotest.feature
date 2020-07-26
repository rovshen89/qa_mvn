Feature: Checkboxradio Page Tests

  @checkboxradiovalidate
  Scenario: Checkboxradio validation test
    Given I am on the jquery homepage
    Then I click on checkboxradio
    Then I switch to demo-frame
    Then I land on the checkboxradio page
    Then I validate number of radios is 3
    Then I validate number of ratings is 4
    Then I validate number of bedTypes is 4

    Scenario: Perform radio button selection
      Given I am on the jquery homepage
      Then I click on checkboxradio
      Then I switch to demo-frame
      Then I land on the checkboxradio page
      Then I select "New York" radio button
      Then I select "Paris" radio button
      Then I select "London" radio button

