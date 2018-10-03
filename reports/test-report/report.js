$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SignedUser.feature");
formatter.feature({
  "line": 1,
  "name": "As a PJI Signed User i want to verify different options available on successful login",
  "description": "",
  "id": "as-a-pji-signed-user-i-want-to-verify-different-options-available-on-successful-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4591932687,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Verify user able to login into the Website with correct credentials",
  "description": "",
  "id": "as-a-pji-signed-user-i-want-to-verify-different-options-available-on-successful-login;verify-user-able-to-login-into-the-website-with-correct-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I Navigated to Papajohns Website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I submit Username and Password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be in Welcome page with User name",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I should see carryout or delivery store",
  "keyword": "And "
});
formatter.match({
  "location": "SignedUserDefs.iNavigatedToPapajohnsWebsite()"
});
formatter.result({
  "duration": 104731968,
  "status": "passed"
});
formatter.match({
  "location": "SignedUserDefs.iSubmitUsernameAndPassword()"
});
formatter.result({
  "duration": 3003937504,
  "status": "passed"
});
formatter.match({
  "location": "SignedUserDefs.iShouldBeInWelcomePageWithUserName()"
});
formatter.result({
  "duration": 60237,
  "status": "passed"
});
formatter.match({
  "location": "SignedUserDefs.iShouldSeeCarryoutOrDeliveryStore()"
});
formatter.result({
  "duration": 55698,
  "status": "passed"
});
formatter.after({
  "duration": 114123982,
  "status": "passed"
});
});