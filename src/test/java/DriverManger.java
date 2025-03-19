import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;

import java.time.Duration;

public class DriverManger {
    static WebDriver driver ;
    static String driverUrl="https://www.automationexercise.com/";

    public static void driverSetup(@Optional("chrome")String Browser){

        if (Browser.toLowerCase()=="chrome"){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (Browser.toLowerCase()=="firefox") {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        } else if (Browser.toLowerCase()=="remote") {
            ///////////
        }
        driver.manage().window().maximize();
        // global waits
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().deleteAllCookies();
        driver.get(driverUrl);
    }

    static public  WebDriver getDriver(){
//        if(driver==null)
//        {System.out.print(" driver not initiated");}
        return driver;
    }

    static public void closeDriver()
    {
        driver.quit();
    }
}
