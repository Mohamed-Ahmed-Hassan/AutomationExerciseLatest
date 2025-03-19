import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void init(){
        homePage = new HomePage(DriverManger.getDriver());
        loginPage = new LoginPage(DriverManger.getDriver());
    }


    @Test
    public void loginTest(){
        homePage.goToSignupLogin();
        loginPage.login("","");
    }

}
