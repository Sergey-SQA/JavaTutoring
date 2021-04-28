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

public class WindowsHandlesSrcTest extends BaseTest {

    private final String URL = "https://the-internet.herokuapp.com/windows";

    @Test
    public void test003() {

        openBrowserAndPage();
        clickOnLink();
        verifyTheAmountOfWin();
        switchToNewWinAndVerifyText();
        driver.quit();

    }

    private void switchToNewWinAndVerifyText() {

        Set<String> winHandlesSet = driver.getWindowHandles();//get descriptors
        Object[] winArray = winHandlesSet.toArray();

        for (int i = 1; i < winArray.length; i++) {

            driver.switchTo().window(winArray[i].toString());
            Assert.assertEquals(driver.getTitle(), "New Window");//get <title>

            boolean isTextThere = driver.getPageSource().contains("<h3>New Window</h3>");
            Assert.assertTrue(isTextThere);

        }

    }

    private void verifyTheAmountOfWin() {
 
        Set<String> winHandles = driver.getWindowHandles();
        int actualWinAmount = winHandles.size();
        int expectedWinAmount = 10; //1 main window + 9 clicks
        Assert.assertEquals(actualWinAmount, expectedWinAmount);

    }

    private void clickOnLink() {

        WebElement element = driver.findElement(By.linkText("Click Here"));
        for (int i = 0; i < 9; i++) {
            element.click();
        }

    }

    private void openBrowserAndPage() {

        openChrome();
        driver.get(URL);
    }

}
