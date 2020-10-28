Feature: Navigating to specific accounts in Accounts Activity


  Scenario: Savings account redirect
    Given the user is logged in
    When the user clicks on Savings link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Savings selected

  Scenario: Brokerage account redirect
    Given the user is logged in
    When the user clicks on Brokerage link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Brokerage selected

  Scenario: Checking account redirect
    Given the user is logged in
    When the user clicks on Checking link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Checking selected

  Scenario: Loan account redirect
    Given the user is logged in
    When the user clicks on Loan link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have Loan selected

  @wip
  Scenario Outline:Different user redirect
    Given the user is logged in
    When the user clicks on "<text>" link on the Account Summary page
    Then the Account Activity page should be displayed
    And Account drop down should have "<dropDown>" selected

    Examples:
      | text      | dropDown  |
      | Savings   | Savings   |
      | Brokerage | Brokerage |
      | Checking  | Checking  |
      | Loan      | Loan      |