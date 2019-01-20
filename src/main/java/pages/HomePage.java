package pages;

import modules.Log;
import modules.PageHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Lokesh_GnanaSekhar on 6/22/2017.
 */
public class HomePage extends PageHandler {

    @FindBy(xpath = "//a[contains(text(),'Start Your Order')]")
    WebElement btnStartYourOrder;

    @FindBy(xpath = "//ul[@class='nav-utility-list']/li[3]/a[1]")
    WebElement btnHeaderLogIn;

    @FindBy(id = "header-account-sign-in-email")
    WebElement txtbxEmailAddress;

    @FindBy(id = "header-account-sign-in-password")
    WebElement txtbxPassword;

    @FindBy(xpath = "//input[@value='Log In']")
    WebElement btnLogIn;

    @FindBy(id = "header-recaptcha_error_msg")
    WebElement txtErrorMsg;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        if (!(driver.getTitle().contains("Order for Delivery or Carryout"))) {
            throw new IllegalStateException("Home page is expected, but not displayed!");
        }
        Log.info("Navigated to Home Page");
    }

    public LocationPage clickStartYourOrder() {
        click(btnStartYourOrder);
        Log.info("Clicked On Start Your order Button");
        return new LocationPage(driver);
    }

    public HomePage clickHeaderLogIn(){
        click(btnHeaderLogIn);
        Log.info("Clicked On Login button in Home Page Start ");
        return this;
    }
    public HomePage setEmailAddress(String email){
        enterText(txtbxEmailAddress,email);
        Log.info("Entered "+email+" in Email TextField ");
        return this;
    }
    public HomePage setPassword(String password){
        enterText(txtbxPassword,password);
        Log.info("Entered "+password+" in password TextField ");
        return this;
    }
    public void clickLogIn(){
        click(btnLogIn);
        Log.info("Clicked On Login button");
    }

    public String getErrorText(){
        waitFor(1);
        return getInnerText(txtErrorMsg);
    }


}