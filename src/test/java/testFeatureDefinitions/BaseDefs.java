package testFeatureDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import modules.Log;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import testUtils.TestBase;

public class BaseDefs extends TestBase {

    @Before
    public void setUp(Scenario scenario){
        createDriver();
        launchWebsite(scenario.getName());
    }

    public void launchWebsite(String scenarioName){
        Log.startTestCase(scenarioName);
        driver.get(projectConfigReader.getURL());
        Log.info("Launching " + projectConfigReader.getURL());
    }

    @After
    public void tearDown(Scenario scenario) {
        Log.endTestCase(scenario.getName());
        if(scenario.isFailed()){
            Log.info("Scenario Failed");
            scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES),"image/png");
        }
        closeDriver();
        Log.info("Closed Website");
    }
}
