package stepdefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import pages.HomePage;
import pages.LocationPage;
import pages.MenuPage;
import utils.TestBase;

public class CarryoutStoreDefs extends TestBase {

    HomePage homePage;
    LocationPage locationPage;
    MenuPage menuPage;

    public CarryoutStoreDefs()
    {
        homePage = new HomePage(driver);
    }


    @When("^I select start your order$")
    public void iSelectStartYourOrder() throws Throwable {

        locationPage = homePage.clickStartYourOrder();
    }

    @And("^I will search for \"([^\"]*)\" Carryout stores$")
    public void iWillSearchForCarryoutStores(String zip) throws Throwable {

        locationPage.selectCarryout()
                    .setTxtbxCarryoutOutZipPostal(zip)
                    .submitZip();
    }

    @And("^I should able to select some Carryout store among the list$")
    public void iShouldAbleToSelectSomeCarryoutStoreAmongTheList() throws Throwable {


    }


}
