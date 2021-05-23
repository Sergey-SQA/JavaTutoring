package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ResultPage {

    private WebDriver driver;
    private By searchResultCounterId = By.id("result-stats");
    private By logoutButtonXpath = By.xpath("//*[@id=\"content\"]/div/a");;

    public ResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifySearchResult() {
        WebElement element = driver.findElement(searchResultCounterId);
        Assert.assertTrue(element.isDisplayed());
    }

    public void verifyLogin() {

        WebElement element = driver.findElement(logoutButtonXpath);
        Assert.assertTrue(element.isDisplayed());

    }

    public void logout() {

        WebElement element = driver.findElement(logoutButtonXpath);
        element.click();

    }

}
