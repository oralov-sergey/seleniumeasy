package core;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObject.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
    public WindowPopupPage windowPopupPage;


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
        this.windowPopupPage = new WindowPopupPage();
    }

    public void waitElement(String xpath) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }

    public void scrollIntoView(String xpath) {
        WebElement element = driver.findElement(By.xpath(xpath));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
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

public void pressCtrlAndSelectSeveralElementsUsingFormat(String xpath, String Place){

    Actions actions = new Actions(driver); // имитация нажатий на клавиатуру
    actions.keyDown(Keys.LEFT_CONTROL)
            .click(driver.findElement(By.xpath(String.format(xpath,Place))))
            .keyUp(Keys.LEFT_CONTROL)
            .build()
            .perform();
}

    public void workingWithAlert(String action) {
        Alert alert = driver.switchTo().alert();
        switch (action) {
            case "accept":
                alert.accept();
                break;
            case "dismiss":
                alert.dismiss();
                break;

        }
    }


    public void sendKeysAlert(String text) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(text);
           }

    public void switchToWindowPopUp(int numberOfWindow) {

        Set<String> abc = driver.getWindowHandles();
        List<String> windowStrings = new ArrayList<>(abc);
        driver.switchTo().window(windowStrings.get(numberOfWindow));
        /*for (String childWindow : driver.getWindowHandles()){
            driver.switchTo().window(childWindow);


        }*/



    }


    public String getCurrentURL(){
        return driver.getCurrentUrl();
    }





    @After
    public void quiteDriver() {
        driver.quit();//quit - close WebDriver and browser. (driver.close - close only browser)
    }
}
