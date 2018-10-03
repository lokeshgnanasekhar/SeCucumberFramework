package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/java/testFeatures/" ,
        glue = "testFeatureDefinitions/" ,
        format={"pretty","html:reports/test-report"},
        tags= "@smoke"
)


public class TestRunner {
}
