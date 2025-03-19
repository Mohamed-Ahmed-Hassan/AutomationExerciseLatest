
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    String browser ="chrome"; //LoadProperties.userData.getProperty("Browser");

    @BeforeMethod
    public void initialization() {
       DriverManger.driverSetup(browser);
    }

    @AfterMethod
    public void closeBrowser() {
     DriverManger.closeDriver();
    }
}
