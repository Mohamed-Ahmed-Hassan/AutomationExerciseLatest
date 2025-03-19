package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    // Locators
    //By signupLoginBtn = By.linkText("Signup / Login");
    By email = By.xpath("//input[@data-qa='login-email']");
    By password = By.xpath("//input[@data-qa='login-password']");
    By loginbtn = By.xpath("//button[text()='Login']");


    //Methods
    public void login(String Email ,String Password){
        //click(signupLoginBtn);
        sendKeys(email,Email);
        sendKeys(password,Password);
        click(loginbtn);

    }

}
