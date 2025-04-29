import DriverManger.DriverManger;
import Pages.HomePage;
import Pages.SignupPage;
import org.testng.annotations.*;
import utilities.CommonAssertion;
import utilities.ExtentReportManager.ExtentReportListener;

@Listeners(ExtentReportListener.class)
public class SignupTest extends BaseTest {
    HomePage homePage;
    SignupPage signup;

    @BeforeMethod
    public void init() {
        homePage = new HomePage();
        signup = new SignupPage();
    }

    @Test
    public void signup() throws InterruptedException {

        //logic and steps
        homePage.goToSignupLogin();
        signup.enterName("Rofida").enterEmail().clickOnSignUpBtn().
                clickOnTitleBtn()
                .enterPassword()
                .SelectDateBirthDate("10", "March", "2002")
                .ClickOnNewsletter()
                .ClickOnSpecialOffer()
                .enterFirstName("rofia")
                .enterLastName("Araby")
                .enterAddress("address")
                .selectCountry("Canada")
                .enterState("state")
                .enterCity("city")
                .enterZipCode("code")
                .enterMobileNumber("010")
                .clickCreate_Account();

// Assertion
        CommonAssertion.assertPageTitle(DriverManger.getDriver(), "https://www.automationexercise.com/account_created");
        CommonAssertion.assertTextEquals(signup.getAccountCreatedMessage(), "Automation Exercise - Account Created");
    }
}

