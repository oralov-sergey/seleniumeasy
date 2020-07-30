import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class SuperClass {
    private static final int TIME_OUT_IN_SECONDS = 10;//created final variable
    private static WebDriver driver;//created variable
    private static WebDriverWait wait;//created variable

    @Before
    public void startWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");//path(way) to start WebDriver
        driver = new ChromeDriver();//class instance
        wait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);//created class instance of WebdriverWait and gave it 2 parameters
    }

    public void waitElementAndClick(String xpath) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();//executed "until" gave it xpath and performed click
    }

    public void getBrowser(String url) {
        driver.get(url);//executed get command with value url (opened page by known url)
    }

    public void waitElementAndSendKeys(String xpath, String text) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).sendKeys(text);//executed "until" gave it xpath and sent text
    }

    public void equalsTwoString(String expected, String actual) { //for every void: it does not return
        assertEquals("Error object not equals", expected, actual);//compare 2 strings and show error massage if strings are not similar
    }

    public String waitElementAndGetText(String xpath) { //warning! instead of "void" write type of variable. The meaning returns.
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).getText();//warning! Must be wrote "return"; gave it xpath, got and after returned  text.
    }

    @After
    public void quiteDriver() {
        driver.quit();//quit - close WebDriver and browser. (driver.close - close only browser)
    }
}
