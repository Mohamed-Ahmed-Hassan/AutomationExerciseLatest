package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    // Locators
    By signupLoginBtn = By.linkText("Signup / Login");


    //Methods
    public void goToSignupLogin(){
        click(signupLoginBtn);
    }

}
