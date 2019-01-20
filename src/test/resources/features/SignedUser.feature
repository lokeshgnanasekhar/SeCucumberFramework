Feature: As a PJI Signed User i want to verify different options available on successful login

  @smoke
  Scenario: Verify invalid user unable to login into the Website with incorrect credentials
    When  I submit invalid Username and Password
    Then  I should be see an Error message



