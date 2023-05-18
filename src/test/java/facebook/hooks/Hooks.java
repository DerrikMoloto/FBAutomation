package facebook.hooks;

import facebook.context.TestContext;
import facebook.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private WebDriver driver;
    public TestContext context;

    public Hooks(TestContext context) {
        this.context = context;
    }


    @Before
    public void driverInitialization(){
        driver = DriverFactory.initializeDriver();
        context.driver = driver;
    }

    @After
    public void closeBrowser(){
        if (driver!= null){
            driver.close();
        }
    }
}
