Feature: As a PJI Signed User i want to verify different options available on successful login

  @smoke
  Scenario: Verify user able to login into the Website with correct credentials
    Given I Navigated to Papajohns Website
    When  I submit Username and Password
    Then  I should be in Welcome page with User name
    And   I should see carryout or delivery store