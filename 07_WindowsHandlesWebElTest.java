import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

/*  1) open browser and the window page
    2) click on the link
    3) verify the amount of windows/tabs
    4) switch to new window
    5) verify window title
 */

public class WindowsHandlesWebElTest extends BaseTest {

    private final String URL = "https://the-internet.herokuapp.com/windows";

    @Test
    public void test004() {

        openBrowserAndPage();
        clickOnLink();
        verifyTheAmountOfWin();
        switchToNewWin();
        verifyWindowTitle();
        verifyTextOnPage();

        driver.quit();

    }

    private void verifyTextOnPage() {

        WebElement element = driver.findElement(By.xpath("/html/body/div/h3"));//look for the element on webpage
        Assert.assertTrue(element.isDisplayed());

    }

    private void verifyWindowTitle() {

        Assert.assertEquals(driver.getTitle(), "New Window");//get <title>, make sure you switched the window

    }

    private void switchToNewWin() {

        Set<String> winHandlesSet = driver.getWindowHandles();//get descriptors

        Object objWinDes =  winHandlesSet.toArray()[4];//get object (string upcast to object)

        if (objWinDes instanceof String) {
            String strWinDes = (String) objWinDes;
            driver.switchTo().window(strWinDes);
        }


    }

    private void verifyTheAmountOfWin() {

        Set<String> winHandles = driver.getWindowHandles();
        int actualWinAmount = winHandles.size();
        int expectedWinAmount = 5; //1 main window + 4 clicks
        Assert.assertEquals(actualWinAmount, expectedWinAmount);

    }

    private void clickOnLink() {

        WebElement element = driver.findElement(By.linkText("Click Here"));
        for (int i = 0; i < 4; i++) {
            element.click();
        }

    }

    private void openBrowserAndPage() {

        openChrome();
        driver.get(URL);
    }

}
