Feature: gmail feature

  Scenario Outline: gmail login
    #Given user navigated to google application - implemented common step in hooks
    When user clicks on gmail link
    And user navigated to gmail application
    And user clicks on signin
    And user enters username "<username>"
    And user enters password "<password>"

    Examples: 
      | username      | password |
      | john@test.com | test123  |
      | john@test.com | test123  |
      | john@test.com | test123  |
      | john@test.com | test123  |
