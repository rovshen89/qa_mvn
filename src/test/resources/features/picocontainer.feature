Feature: Pass data from one step to another

  @radiosselectionpico
  Scenario: Perform radio button selection
    Given I am on the jquery homepage
    Then I click on checkboxradio
    Then I switch to demo-frame
    Then I land on the checkboxradio page
    Then I only select "New York" radio button
    Then I validate radiocheckbox selection
    Then I only select "Paris" radio button
    Then I validate radiocheckbox selection
    Then I only select "London" radio button
    Then I validate radiocheckbox selection
