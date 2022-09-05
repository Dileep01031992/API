package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\features\\dataTables.feature",
plugin= {"pretty","json:target/jsonReports/cucumber-report.json"},
glue={"stepDefinations"},
monochrome=true
//dryRun=true,
//strict=false
		)

public class TestdataRunner {

}
