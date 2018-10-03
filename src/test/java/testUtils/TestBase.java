package testUtils;

import modules.ProjectConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public WebDriver driver;
    public ProjectConfigReader projectConfigReader;

    public void createDriver() {

        projectConfigReader = new ProjectConfigReader();

        String browserName = projectConfigReader.getBrowserName();

        switch (browserName) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "./src/test/java/testresources/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "./src/test/java/testresources/geckodriver.exe");
                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                driver = new FirefoxDriver(capabilities);

                break;
            case "ie":
                System.setProperty("webdriver.ie.driver", "./src/test/java/testresources/IEDriverServer.exe");
                driver = new InternetExplorerDriver();

                break;
            default:
                System.exit(0);

        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    public void closeDriver(){
        driver.quit();
    }
}
