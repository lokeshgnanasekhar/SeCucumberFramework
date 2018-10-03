package testFeatureDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import testUtils.TestBase;

public class BaseDefs extends TestBase {

    @Before
    public void setUp(){
        createDriver();
        launchWebsite();
    }

    public void launchWebsite(){
        driver.get(projectConfigReader.getURL());
        System.out.println("Launching " + projectConfigReader.getURL());
    }

    @After
    public void tearDown() {
        closeDriver();
        System.out.println("Closed Website");
    }
}
