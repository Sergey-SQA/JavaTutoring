package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ResultPage {

    private WebDriver driver;
    private By elementId = By.id("result-stats");

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyResult() {
        WebElement element = driver.findElement(elementId);
        Assert.assertTrue(element.isDisplayed());
    }

}
