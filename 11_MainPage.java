package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPage {

    private WebElement element;
    private WebDriver driver;
    private By inputElementName = By.name("q");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public void typeSearchQuiry(String searchLine) {
        element = driver.findElement(inputElementName);
        element.sendKeys(searchLine);
    }

    public void submitQuiry() {
        element.submit();
    }

}
