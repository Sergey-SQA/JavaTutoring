package UiTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeSuite
    public void openChrome() {

        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers win/chromedriver.exe");

        driver = new ChromeDriver();

    }

    public void openEdge() {

        System.setProperty("webdriver.edge.driver",
                "src/test/resources/drivers win/msedgedriver.exe");

        driver = new EdgeDriver();

    }

    public void waitForElementByName(String elementName) {
        wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(elementName)));
    }


}
