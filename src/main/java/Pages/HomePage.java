package Pages;

import DriverManger.DriverManger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.ElementHelper;

public class HomePage {
    WebDriver driver;

    By signupLogin = By.linkText("Signup / Login");

    public HomePage() {
        this.driver = DriverManger.getDriver();
    }

    public void goToSignupLogin() {
        ElementHelper.click(driver, signupLogin);
    }
}