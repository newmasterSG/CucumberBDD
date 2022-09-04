package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/smoke.feature",
        glue = "stepdefinitions",
        plugin = "pretty",
        dryRun=true,
        monochrome = true

)
public class RunnerTests {
}
