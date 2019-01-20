package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/java/testFeatures/" ,
        glue = "testFeatureDefinitions/",
        plugin = { "html:reports/test-reports/cucumber-html-reports", "json:reports/test-reports/cucumber-html-reports/cucumber.json"}
)


public class TestRunner {
}
