package Base;

import Pages.PackagesPage;
import com.shaft.driver.DriverFactory;
import com.shaft.driver.SHAFT;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    ChromeOptions options;
    protected SHAFT.GUI.WebDriver driver;
    protected PackagesPage saPackagesPage;

    // Base URls :
    private static final String BaseURl = System.getProperty("BaseURl");  //Sa Base Url .

    @BeforeClass
    public void BeforeClass(){
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new SHAFT.GUI.WebDriver(DriverFactory.DriverType.CHROME, options);

        saPackagesPage = new PackagesPage(driver);
        driver.browser().navigateToURL(BaseURl);

    }
}
