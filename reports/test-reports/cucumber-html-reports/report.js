$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/CarryoutStore.feature");
formatter.feature({
  "name": "As a PJI  User i want to set a Carryout store using different Options",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify user able to set Carryout store",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I select start your order",
  "keyword": "When "
});
formatter.match({
  "location": "CarryoutStoreDefs.iSelectStartYourOrder()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I will search for \"40220\" Carryout stores",
  "keyword": "And "
});
formatter.match({
  "location": "CarryoutStoreDefs.iWillSearchForCarryoutStores(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should able to select some Carryout store among the list",
  "keyword": "And "
});
formatter.match({
  "location": "CarryoutStoreDefs.iShouldAbleToSelectSomeCarryoutStoreAmongTheList()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/features/SignedUser.feature");
formatter.feature({
  "name": "As a PJI Signed User i want to verify different options available on successful login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify invalid user unable to login into the Website with incorrect credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I submit invalid Username and Password",
  "keyword": "When "
});
formatter.match({
  "location": "SignedUserDefs.iSubmitInvalidUsernameAndPassword()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be see an Error message",
  "keyword": "Then "
});
formatter.match({
  "location": "SignedUserDefs.iShouldBeSeeAnErrorMessage()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Re-enter your password and verify that you are human.]\u003e but was:\u003c[]\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat testFeatureDefinitions.SignedUserDefs.iShouldBeSeeAnErrorMessage(SignedUserDefs.java:34)\n\tat ✽.I should be see an Error message(src/test/resources/features/SignedUser.feature:6)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});