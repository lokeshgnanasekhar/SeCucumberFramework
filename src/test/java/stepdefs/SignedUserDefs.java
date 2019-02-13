package stepdefs;


import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import utils.TestBase;

public class SignedUserDefs extends TestBase {

    HomePage homePage;

    public SignedUserDefs()
    {
        homePage = new HomePage(driver);
    }

    @When("^I submit invalid Username and Password$")
    public void iSubmitInvalidUsernameAndPassword() throws Throwable {
        homePage.clickHeaderLogIn()
                .setEmailAddress("qa001@papajohns.com")
                .setPassword("TestUser!1")
                .clickLogIn();
    }

    @Then("^I should be see an Error message$")
    public void iShouldBeSeeAnErrorMessage() throws Throwable {
        String errorText = homePage.getErrorText();
        Assert.assertTrue(errorText.contains("Re-enter"));

    }

    @Then("^I should be not see an Error message$")
    public void iShouldBeNotSeeAnErrorMessage() throws Throwable {
        String errorText = homePage.getErrorText();
        Assert.assertTrue(errorText.contains("Reenter"));
    }


}
