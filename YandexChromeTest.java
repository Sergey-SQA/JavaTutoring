import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

    /*  1) open browser
        2) go to main page
        3) type the query search
        4) submit the query
        5) verify the search results
     */

public class YandexChromeTest {

    private WebDriver driver;
    private WebElement element;
    private static final String URL = "https://www.ya.ru";

    @Test
    public void test001() {

        openBrowser();
        goToMainPage();
        typeSearchQuiry();
        submitQuiry();
        waitUntillElement();
        verifyResult();
        driver.close();

    }

    private void verifyResult() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"search-result-aside\"]/div/div[2]"));
        Assert.assertTrue(element.isDisplayed());
    }

    private void waitUntillElement() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"search-result-aside\"]/div/div[2]")));
    }

    private void submitQuiry() {
        element.submit();
    }

    private void typeSearchQuiry() {
        element = driver.findElement(By.xpath("//*[@id=\"text\"]"));
        element.sendKeys("Portnov school new address");

    }

    private void goToMainPage() {
        driver.get(URL);
    }

    private void openBrowser() {

        System.setProperty("webdriver.chrome.driver",
                "D:\\Feb02WebdriverProject\\src\\test\\resources\\drivers win\\chromedriver.exe");

        driver = new ChromeDriver();

    }

}
