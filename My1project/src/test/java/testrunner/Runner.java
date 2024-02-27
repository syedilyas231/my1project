package testrunner;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonFormat;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.messages.types.Feature;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/resources/featurefile"},
        glue = {"stepdefination"},
        tags = "@am02",
        plugin = {"pretty",
        "html:target/test-output/report.html","json:target/test-output/report.json","junit:target/test-output/report.xml"
        }
)

public class Runner {
}
