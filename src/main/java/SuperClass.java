import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class SuperClass {
    private static final int TIME_OUT_IN_SECONDS = 10;
    private static WebDriver driver;

    @Before
    public void startWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public void waitElementAndClick(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();
    }

    public void getBrowser(String url) {
        driver.get(url);

    }

    public void waitElementAndSendKeys(String xpath, String text) {
        WebDriverWait wait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).sendKeys(text);
    }

    public void equalsTwoString(String expected, String actual) {
        assertEquals("Error object not equals", expected, actual);
    }

    public String waitElementAndGetText(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);

        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).getText();
    }


    @After
    public void quiteDriver() {
        driver.quit();
    }
}
