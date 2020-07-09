#Recognized step keywords: Given, When, Then, And, But, *

Feature: JQuery homepage
  Test the homepage of https://jqueryui.com website

  Background: Initial setup

  @controlgroup @regression
  Scenario: Test controlgroup button
  This screnario is to test controlgroup button
    When I click on controlgroup
    Then I land on the controlgroup page

  @datepicker @smoke
  Scenario: Test datepicker button
  This screnario is to test datepicker button
    When I click on datepicker
    Then I land on the datepicker page

  @checkboxradio @jquery
  Scenario: Test checkboxradio button
  This screnario is to test checkboxradio button
    When I click on checkboxradio
    Then I land on the checkboxradio page
