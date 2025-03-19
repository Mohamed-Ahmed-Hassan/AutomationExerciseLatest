package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends BasePage {
    //WebElement nameField = driver.findElement(By.name("name"));
//    @FindBy(name = "name")
//    WebElement nameField;

    // Locators
    //By signupLoginBtn = By.linkText("Signup / Login");
    By nameField = By.name("name");
    By email = By.xpath("//input[@data-qa='signup-email']");
    By signupBtn = By.xpath("//button[text()='Signup']");
    By Title = By.xpath("//input[@id='id_gender1' or @value='Mr']");
    By Password = By.id("password");
    By DaysDropdown = By.xpath("//select[@data-qa='days']");
    By MonthDropdown = By.id("months");
    By YearsDropdown = By.id("years");
    By newsletter= By.id("newsletter");
    By optin = By.id("optin");
    By First_name = By.id("first_name");
    By last_name = By.id("last_name");
    By Address = By.id("address1");
    By countryDropdown = By.id("country");
    By state = By.id("state");
    By city = By.id("city");
    By zipcode = By.id("zipcode");
    By mobile_number = By.id("mobile_number");
    By Create_Account = By.xpath("//button[text()='Create Account']");

    SignupPage(WebDriver driver) {
        super(driver);
    }


    // Methods
    public void Registration(String name,String Email, String password ){
        //click(signupLoginBtn);
        sendKeys(nameField,name);
        sendKeys(email,Email);
        click(signupBtn);
        click(Title);
        sendKeys(Password,password);
        selectByValue(DaysDropdown,"20");
        selectByVisibleText(MonthDropdown,"March");
        selectByIndex(YearsDropdown,3);
        click(newsletter);
        click(optin);
        sendKeys(First_name,"rofida");
        sendKeys(last_name,"Araby");
        sendKeys(Address,"Egypt");
        selectByIndex(countryDropdown,2);
        sendKeys(state,"A");
        sendKeys(city,"Egypt");
        sendKeys(zipcode,"555");
        sendKeys(mobile_number,"010");
        click(Create_Account);
    }

}
