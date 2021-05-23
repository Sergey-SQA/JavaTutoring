package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class MainPage {

    private WebElement element;
    private WebDriver driver;

    private By searchFieldName = By.name("q");
    private By usernameFieldXpath = By.xpath("//*[@id=\"username\"]");
    private By passwordFieldXpath = By.xpath("//*[@id=\"password\"]");
    private By loginButtonXpath = By.xpath("//*[@id=\"login\"]/button");

    //general methods

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public void typeSearchQuiry(String searchLine) {
        element = driver.findElement(searchFieldName);
        element.sendKeys(searchLine);
    }

    public void submitQuiry() {
        element.submit();
    }

    //login methods

    public void inputCredentialsAndSubmit(String username, String password) {

        WebElement elementName = driver.findElement(usernameFieldXpath);
        elementName.sendKeys(username);

        WebElement elementPass = driver.findElement(passwordFieldXpath);
        elementPass.sendKeys(password);

        WebElement elementButton = driver.findElement(loginButtonXpath);
        elementButton.click();

    }

    public void verifyLogout() {

        WebElement element = driver.findElement(loginButtonXpath);
        Assert.assertTrue(element.isDisplayed());

    }

}
