package facebook.TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        plugin = {"html:target/reports/htmlReport.html"},
        monochrome = true,
        glue = {"selenium.stepDefs","selenium.hooks"},
        features = {"src/test/resources/features"}
)

public class TestNGRunnerTest  extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
