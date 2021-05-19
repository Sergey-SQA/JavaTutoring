package UiTests;

import Pages.MainPage;
import Pages.ResultPage;
import org.testng.annotations.Test;

public class SearchTestPom extends BaseTest {

    @Test
    public void test005() {

        MainPage mainPage = new MainPage(driver);
        ResultPage resultPage = new ResultPage(driver);

        mainPage.goToUrl("https://www.google.com/");
        mainPage.typeSearchQuiry("Portnov Computer School");
        mainPage.submitQuiry();
        waitForElementByName("result-stats");
        resultPage.verifyResult();
        driver.quit();

    }
}