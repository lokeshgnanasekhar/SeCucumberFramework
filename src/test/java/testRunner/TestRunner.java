package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/java/testFeatures/" ,
        glue = "testFeatureDefinitions/"
)


public class TestRunner {
}
