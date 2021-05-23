package UiTests;

import Pages.MainPage;
import Pages.ResultPage;
import org.testng.annotations.Test;

public class AuthorTestPom extends BaseTest {

    @Test
    public void test006() {

        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);

        mainPage.goToUrl("https://the-internet.herokuapp.com/login");
        mainPage.inputCredentialsAndSubmit("tomsmith", "SuperSecretPassword!");
        resultPage.verifyLogin();
        resultPage.logout();
        mainPage.verifyLogout();
        driver.quit();

    }

}
