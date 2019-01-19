package pages;

import modules.PageHandler;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Lokesh_GnanaSekhar on 6/22/2017.
 */
public class MenuPage extends PageHandler {


    @FindBy(id = "locationAccordion")
    WebElement locationSelectionBlock;

    @FindBy(xpath = "//*[@id='locationSection']/div/a")
    WebElement startOverLink;


    public MenuPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        waitFor(3);
       /* if (!(driver.getTitle().contains("Menu"))) {
            throw new IllegalStateException("Menu page is expected, but not displayed!");
        }*/
        System.out.println("Navigated to Menu Page");
    }

    public void editLocation(){
        System.out.println("Wait for 2 secs");
        waitFor(2);
        System.out.println("Waiting for LocationPage selection block");
        waitForElementToBeVisible(locationSelectionBlock);
        System.out.println("Clicked on LocationPage selection block");
        click(locationSelectionBlock);
        System.out.println("Clicked on Start over link");
        click(startOverLink);


    }

    public void verifyWelcomePage(){
        System.out.println("I am in Welcome Page");
    }

    public void verifyStore(){
        System.out.println("I Should see Carryout and Delivery Store");
    }

}
