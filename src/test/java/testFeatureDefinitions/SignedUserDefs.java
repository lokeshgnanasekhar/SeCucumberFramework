package testFeatureDefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.MenuPage;
import testUtils.TestBase;

public class SignedUserDefs extends TestBase {

    HomePage homePage;

    public SignedUserDefs()
    {
        homePage = new HomePage(driver);
    }

    @When("^I submit Username and Password$")
    public void iSubmitUsernameAndPassword() throws Throwable {
        homePage.clickHeaderLogIn()
                .setEmailAddress("qa001@papajohns.com")
                .setPassword("TestUser!1")
                .clickLogIn();
    }

    @Then("^I should be in Welcome page with User name$")
    public void iShouldBeInWelcomePageWithUserName() throws Throwable {

    }

}
