package pageObject;

import core.SuperClass;
import org.openqa.selenium.By;

public class JavaScriptAlertBoxPage extends SuperClass {
    private static final String URL = "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
    private static final String CLICK_ME_BUTTON = "(//button[contains(.,'Click me!')])[1]";

    private static final String CLICK_ME_BUTTON_CONFIRM_BOX = "(//button[contains(.,'Click me!')])[2]";
    private static final String CHEKING_TEXT_CONFIRM_BOX_XPATH = "//p[@id='confirm-demo']";
    private static final String CHEKING_TEXT_CONFIRM_BOX = "You pressed %s!";

    private static final String CLICK_FOR_PROMPT_BOX_BUTTON = "(//button[@class='btn btn-default btn-lg'])[2]";
    private static final String CHEKING_TEXT_PROMPT_BOX_XPATH = "//p[contains(@id,'prompt-demo')]";
    private static final String CHEKING_TEXT_PROMPT_BOX_POSITIVE_CASE = "You have entered '%s' !";
    private static final String NAME = "Oleg";


    public void getUrl() {
        getBrowser(URL);
    }

    public void clickToDisplayAnAlertBox(){
        waitElementAndClick(CLICK_ME_BUTTON);
    }

    public void switchToAlertAndAccept(){
        workingWithAlert("accept");
    }

    public void switchToAlertAndDismiss() {

        workingWithAlert("dismiss");
    }

    public void clickToDisplayAnAlertConfirmBox(){

        waitElementAndClick(CLICK_ME_BUTTON_CONFIRM_BOX);
    }

    public String getDisplayedTextConffirmBox() {
        return waitElementAndGetText(CHEKING_TEXT_CONFIRM_BOX_XPATH);
    }

    public void comparePositiveResultsConfirmBox(){
        equalsTwoString(String.format(CHEKING_TEXT_CONFIRM_BOX,"OK"), getDisplayedTextConffirmBox());
    }

    public void compareNegativeResultsConfirmBox(){
        equalsTwoString(String.format(CHEKING_TEXT_CONFIRM_BOX,"Cancel"), getDisplayedTextConffirmBox());
    }

    public void clickToDisplayAnAlertPromptBox(){
        waitElementAndClick(CLICK_FOR_PROMPT_BOX_BUTTON);
    }

    public String getDisplayedTextPromptBoox() {
        return waitElementAndGetText(CHEKING_TEXT_PROMPT_BOX_XPATH);
    }


    public void switchToAlertWriteNameAndAccept(){
        sendKeysAlert(NAME);
        workingWithAlert("accept");
    }

    public void comparePositiveResultsPromptBox(){
        equalsTwoString(String.format(CHEKING_TEXT_PROMPT_BOX_POSITIVE_CASE,NAME), getDisplayedTextPromptBoox());
    }



}
