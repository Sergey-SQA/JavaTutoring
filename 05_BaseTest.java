import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import javax.lang.model.element.AnnotationMirror;

public class BaseTest {

    WebDriver driver;

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

}
