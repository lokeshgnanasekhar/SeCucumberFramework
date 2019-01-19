package pages;

import modules.Log;
import modules.PageHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationPage extends PageHandler {

    @FindBy(xpath = "//a[@id='carryoutFormAccordion']")
    WebElement btnWantToCarryItOut;

    @FindBy(xpath = "//div[@id='carryout-form']/a/i")
    WebElement WantToCarryItOutArrow;

    @FindBy(xpath = "//span[@class='find-store']")
    WebElement btnLocateMe;

    @FindBy(xpath = "//input[@id='locations-zipPostalcode']")
    WebElement txtbxCarryoutOutZipPostal;

    @FindBy(xpath = "//input[@class='button']")
    WebElement btnSubmitCarryout;

    @FindBy(xpath = "//a[text()='View more stores']")
    WebElement lnkViewMoreStores;


    public LocationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

        if (!(driver.getTitle().contains("Stores Near Me"))) {
            throw new IllegalStateException("Location page is expected, but not displayed!");
        }

        Log.info("Navigated to Location Page");
    }

    public LocationPage selectCarryout() {
        click(btnWantToCarryItOut);
        Log.info("Selected  Delivery type as Carryout");
        return this;
    }
    public LocationPage setTxtbxCarryoutOutZipPostal(String zip) {
        enterText(txtbxCarryoutOutZipPostal,zip);
        Log.info("Entered Carryout Zipcode as -- "+zip);
        return this;
    }

    public LocationPage submitZip(){
        click(btnSubmitCarryout);
        Log.info("Clicked on submit");
        return this;
    }

    public LocationPage viewMoreStores(){
        click(lnkViewMoreStores);
        Log.info("Click on View more stores link");
        return this;
    }

    public LocationPage expandCarryouStore(String StrNum) {
        WebElement expandCarryoutButton = driver.findElement(By.xpath("//form[contains(@action,'CARRYOUT/" + StrNum + "')]/ancestor::article//a/i"));
        if(waitForElementToBeVisible(expandCarryoutButton)){
            expandCarryoutButton.click();
            Log.info("Expanded Carryout store");
        }
        return this;
    }

    public void selectOrderCarryoutForStore(String StrNum) {
        WebElement selectCarryoutButton = driver.findElement(By.xpath("//form[contains(@action,'CARRYOUT/" + StrNum + "')]/button"));
        if(waitForElementToBeVisible(selectCarryoutButton)){
            selectCarryoutButton.click();
            Log.info("Expanded Carryout store");
        }
    }

}
