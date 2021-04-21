import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class YahooEdgeTest {

    private WebDriver driver;
    private WebElement element;
    private static final String URL = "https://www.yahoo.com/";

    @Test
    public void test002() {

        openBrowser();
        goToMainPage();
        makeSearchQuiry();
        waitUntillElement();
        verifyResult();
        driver.close();
        
    }

    private void verifyResult() {

        WebElement element = driver.findElement(By.xpath("//*[@id=\"sf\"]/label[2]/input"));
        Assert.assertTrue(element.isDisplayed());

    }

    private void waitUntillElement() {

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"sf\"]/label[2]/input")));

    }

    private void makeSearchQuiry() {

        element = driver.findElement(By.xpath("//*[@id=\"ybar-sbq\"]"));
        element.sendKeys("w3 school");
        element.submit();

    }

    private void goToMainPage() {

        driver.get(URL);

    }

    private void openBrowser() {

       System.setProperty("webdriver.edge.driver", "D:\\Feb02WebdriverProject\\src\\test\\resources\\drivers win\\msedgedriver.exe");

        driver = new EdgeDriver();

    }


}
