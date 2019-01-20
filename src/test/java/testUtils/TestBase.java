package testUtils;

import io.github.bonigarcia.wdm.WebDriverManager;
import modules.Log;
import modules.ProjectConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class TestBase {

    public static WebDriver driver;
    public static ProjectConfigReader projectConfigReader;
    public static Logger logger;

    public void createDriver() {

        initialize();

        String browserName = projectConfigReader.getBrowserName();

        switch (browserName) {
            case "chrome":

                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

            case "firefox":

                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "ie":

                WebDriverManager.chromedriver().setup();
                driver = new InternetExplorerDriver();
                break;

            default:
                System.exit(0);

        }
        System.out.println("Driver Created");
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    public void  initialize(){

        projectConfigReader = new ProjectConfigReader();
       // Logger logger = Logger.getLogger(projectConfigReader.getURL());

    }

    public void closeDriver(){
        driver.quit();
    }
}
