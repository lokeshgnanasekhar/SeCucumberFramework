package testFeatureDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import modules.Log;
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
        closeDriver();
        Log.info("Closed Website");
    }
}
