package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //Instructs Junit to run this class as Cucumber test runner
@CucumberOptions(
        dryRun = false, //execute the feature and validate whether the feature exists
        features = "classpath:features",
        glue = {"stepDefs"}

)
public class RunCukesTest {

}
