package facebook.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver initializeDriver(){
        WebDriver driver;
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
