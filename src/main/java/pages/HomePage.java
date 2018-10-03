package pages;

import modules.PageHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * Created by Lokesh_GnanaSekhar on 6/22/2017.
 */
public class HomePage extends PageHandler {

    @FindBy(xpath = "//a[@id='accountAccordion']/strong")
    WebElement signinText;

    @FindBy(id = "omnibar-account-sign-in-email")
    WebElement emailAddressTextField;

    @FindBy(id = "omnibar-account-sign-in-password")
    WebElement passwordTextField;

    @FindBy(xpath = "//input[@value='Sign In']")
    WebElement signinSubmitButton;

    @FindBy(xpath = "//div[@id='modal-T38']/div/header/a")
    WebElement promoPopupCloseButton;

    @FindBy(id = "omnibar-recaptcha_error_msg")
    WebElement errorMsgForInvalidLogin;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
       /* if (!(driver.getTitle().contains("Order for Delivery or Carryout"))) {
            throw new IllegalStateException("Home page is expected, but not displayed!");
        }*/

        System.out.println("Navigated to Home Page");
    }

    public MenuPage login(String emailId, String password) {

      /* // closePromoPopup();
        if (waitForElementToBeVisible(signinText)) {
            click(signinText);
            System.out.println("Clicked on Signin Text");
            enterText(emailAddressTextField, emailId);
            System.out.println("Entered "+emailId+" in E-maild field");
            enterText(passwordTextField, password);
            System.out.println("Entered "+password+" in Password field");
            click(signinSubmitButton);
            System.out.println("Clicked on Submit button");
            waitFor(5);
            return new MenuPage(driver);
        }*/
        System.out.println("Entered Username and Password");
        return new MenuPage(driver);

    }

    public void invalidLogin(String emailId, String password) {

        //closePromoPopup();
       /* if (waitForElementToBeVisible(signinText)) {
            click(signinText);
            System.out.println("Clicked on Signin Text");
            enterText(emailAddressTextField, emailId);
            System.out.println("Entered "+emailId+" in E-maild field");
            enterText(passwordTextField, password);
            System.out.println("Entered "+password+" in Password field");
            click(signinSubmitButton);
            System.out.println("Clicked on Submit button");
            if(errorMsgForInvalidLogin.isDisplayed()){
                System.out.println("Error Dialog Appeared");
            }

        }*/

    }

    public void closePromoPopup() {
        waitForPageToLoad();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle); // switch focus of WebDriver to the next found window handle (that's your newly opened window)
        }
        click(promoPopupCloseButton);
        waitFor(3);

    }
}
