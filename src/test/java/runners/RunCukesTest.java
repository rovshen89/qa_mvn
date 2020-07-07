package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //Instructs Junit to run this class as Cucumber test runner
@CucumberOptions(
        dryRun = false, //execute the feature and validate whether the feature exists
        features = "classpath:features", //location of the features file folder
        glue = {"stepDefs"}, //location of the set definition classes
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
)
public class RunCukesTest {

}
