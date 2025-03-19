import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class SignupTest extends BaseTest{

    @Test
    public void signup() throws InterruptedException {
        WebElement signupLoginBtn = DriverManger.getDriver().findElement(By.linkText("Signup / Login"));
        signupLoginBtn.click();

        WebElement nameField = DriverManger.getDriver().findElement(By.name("name"));
        nameField.sendKeys("rofid005999321@");

        WebElement email = DriverManger.getDriver().findElement(By.xpath("//input[@data-qa='signup-email']"));
        email.sendKeys("Ro00097097491234@atos.net");

        WebElement signupBtn = DriverManger.getDriver().findElement(By.xpath("//button[text()='Signup']"));
        signupBtn.click();

        // static and we need to be dynamic
        WebElement Title = DriverManger.getDriver().findElement(By.xpath("//input[@id='id_gender1' or @value='Mr']"));
        Title.click();
        WebElement Password = DriverManger.getDriver().findElement(By.id("password"));
        Password.sendKeys("123456789");

        WebElement DaysDropdown = DriverManger.getDriver().findElement(By.xpath("//select[@data-qa='days']"));
        Select Days = new Select(DaysDropdown);
        Days.selectByValue("22");

        WebElement MonthDropdown = DriverManger.getDriver().findElement(By.id("months"));
        Select Month = new Select(MonthDropdown);
        Month.selectByVisibleText("March");

        WebElement YearsDropdown = DriverManger.getDriver().findElement(By.id("years"));
        Select Years = new Select(YearsDropdown);
        Years.selectByIndex(2);
        WebElement newsletter = DriverManger.getDriver().findElement(By.id("newsletter"));
        newsletter.click();
        WebElement optin = DriverManger.getDriver().findElement(By.id("optin"));
        optin.click();

        WebElement First_name = DriverManger.getDriver().findElement(By.id("first_name"));
        First_name.sendKeys("rofida");
        WebElement last_name = DriverManger.getDriver().findElement(By.id("last_name"));
        last_name.sendKeys("Araby");
        WebElement Address = DriverManger.getDriver().findElement(By.id("address1"));
        Address.sendKeys("street");

        WebElement countryDropdown = DriverManger.getDriver().findElement(By.id("country"));
        Select country = new Select(countryDropdown);
        country.selectByIndex(2);

        WebElement state = DriverManger.getDriver().findElement(By.id("state"));
        state.sendKeys("A");
        WebElement city = DriverManger.getDriver().findElement(By.id("city"));
        city.sendKeys("city");
        WebElement zipcode = DriverManger.getDriver().findElement(By.id("zipcode"));
        zipcode.sendKeys("020");
        WebElement mobile_number = DriverManger.getDriver().findElement(By.id("mobile_number"));
        mobile_number.sendKeys("010");
        WebElement Create_Account = DriverManger.getDriver().findElement(By.xpath("//button[text()='Create Account']"));
        Create_Account.click();
        Thread.sleep(1000);

        // Hard Assertion.
        String AcualMassage = DriverManger.getDriver().findElement(By.xpath("//h2[@data-qa='account-created']")).getText();
        String ExpectedMassage = "ACCOUNT CREATED!";
        Assert.assertEquals(AcualMassage, ExpectedMassage, "account not created successfully");
        String ExpectedURL = "https://www.automationexercise.com/account_created";
        Assert.assertEquals(DriverManger.getDriver().getCurrentUrl(), ExpectedURL, "account not created successfully");
        // soft assertion
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(AcualMassage, ExpectedMassage, "fail");
        System.out.print("pass/fail");


        // Implicit Wait --> driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//     WebDriver driver;
//     HomePage homePage;
//     SignupPage signupPage;
//     //AccountCreatedPage accountCreatedPage;
//     LoginPage loginPage;
//
//    @Test
//    public void signupTest() {
//        homePage.goToSignupLogin();
//        signupPage.registerUser("rofida@", "moRo000@atos.net", "123456789");
//      //  accountCreatedPage.verifyAccountCreation();
//    }
//    @Test
//    public void loginTest() {
//        homePage.goToSignupLogin();
//        loginPage.login("moRo@atos.net", "123456789");
//    }
//
    }
}

