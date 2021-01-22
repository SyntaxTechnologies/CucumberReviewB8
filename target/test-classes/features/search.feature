#author: asel@syntaxtechs.com
@search @sprint5
Feature: Search feature/funtionality

  Background: 
    When user enters any text

  @smoke
  Scenario: search by typing and hit enter
    #Given user navigated to google application - implemented common step in hooks
    And hit enter
    Then result is displayed

  @regression
  Scenario: search by typing and using google serach button
    #Given user navigated to google application  - implemented common step in hooks
    And click on google search button
    Then result is displayed
