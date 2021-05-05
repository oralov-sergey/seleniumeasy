package core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.*;
import tests.CheckBox;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SuperClass {
    private static final int TIME_OUT_IN_SECONDS = 10;//created final variable
    private static WebDriver driver;//created variable
    private static WebDriverWait wait;//created variable
    public SimpleFormPage simpleFormPage;//created instance for page Simple Form
    public CheckBoxPage checkBoxPage;
    public RadioButtonPage radioButtonPage;
    public OtherPage otherPage;
    public SelectListPage selectListPage;
    public GroupRadioButtonPage groupRadioButtonPage;
    public MultiSelectListPage multiSelectListPage;
    public JavaScriptAlertBoxPage javaScriptAlertBoxPage;
    public JavaScriptConfirmBoxPage javaScriptConfirmBoxPage;
    public JavaScriptAlertPromptBoxPage javaScriptAlertPromptBoxPage;


    @Before
    public void startWebDriver() {
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver90.exe");//path(way) to start WebDriver
        driver = new ChromeDriver();//class instance
        wait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);//created class instance of WebdriverWait and gave it 2 parameters
        this.checkBoxPage = new CheckBoxPage();
        this.simpleFormPage = new SimpleFormPage();
        this.radioButtonPage = new RadioButtonPage();
        this.otherPage = new OtherPage();
        this.selectListPage = new SelectListPage();
        this.groupRadioButtonPage = new GroupRadioButtonPage();
        this.multiSelectListPage = new MultiSelectListPage();
        this.javaScriptAlertBoxPage = new JavaScriptAlertBoxPage();
        this.javaScriptConfirmBoxPage = new JavaScriptConfirmBoxPage();
        this.javaScriptAlertPromptBoxPage = new JavaScriptAlertPromptBoxPage();
    }

    public void waitElementAndClick(String xpath) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();//executed "until" gave it xpath and performed click
    }

    public void waitElementAndClickUsingFormat(String xpath, String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(String.format(xpath, name)))).click();
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


    public void selectValueDropdown(String locator, String textExpected) {
        Select dropdown = new Select(driver.findElement(By.xpath(locator)));
        dropdown.selectByVisibleText(textExpected);
    }



    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
          }

    public void dismissAlert() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void sendKeysAlert(String text) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
           }










    @After
    public void quiteDriver() {
        driver.quit();//quit - close WebDriver and browser. (driver.close - close only browser)
    }
}
