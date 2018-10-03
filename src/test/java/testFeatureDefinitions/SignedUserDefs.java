package testFeatureDefinitions;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.MenuPage;
import testUtils.TestBase;

public class SignedUserDefs {

    HomePage homePage;
    MenuPage menuPage;
    TestBase testBase;

    public SignedUserDefs(TestBase base)
    {
        testBase = base;
        homePage = new HomePage(testBase.driver);
    }

    @Given("^I Navigated to Papajohns Website$")
    public void iNavigatedToPapajohnsWebsite() throws Throwable {
        System.out.println("Navigated to Papajohns Website");
    }

    @When("^I submit Username and Password$")
    public void iSubmitUsernameAndPassword() throws Throwable {
        menuPage = homePage.login("","");

    }

    @Then("^I should be in Welcome page with User name$")
    public void iShouldBeInWelcomePageWithUserName() throws Throwable {
        menuPage.verifyWelcomePage();
    }

    @And("^I should see carryout or delivery store$")
    public void iShouldSeeCarryoutOrDeliveryStore() throws Throwable {
        menuPage.verifyStore();
    }
}
