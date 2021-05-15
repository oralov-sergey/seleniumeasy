package pageObject;

import core.SuperClass;

public class BootstrapAlertMessegePage extends SuperClass {
    public static final String URL = "https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html";
    public static final String BUTTON = "//button[contains(.,'%s')]";
    public static final String GREEN_NORMAL_MESSAGE_XPATH = "//div[@class='alert alert-success alert-normal-success']";
    public static final String GREEN_AUTOCLOSEABLE_MESSAGE_XPATH = "//div[contains(@class,'alert alert-success alert-autocloseable-success')]";
    public static final String CROSS_BUTTON = "(//button[@class='close'])[%s]";
    public static final String STYLE_IS_DISPLAY_NONE = "display: none;";


    public void getUrl(){
        getBrowser(URL);
    }


    public void clickAlertDialogBoxButton(String buttonText){
        waitElementAndClick(String.format(BUTTON,buttonText));
    }

    public String getThisColor(String messageXpath){

    return getMessageBackGroundColor(messageXpath);


    }

    public void compareColors(String color, String messageXpath){
        equalsTwoString(color,getThisColor(messageXpath));
    }


    public String getMessageText(String messageXpath) {
        return waitElementAndGetText(messageXpath);
    }


    public void comareTexts(String messageText,String messageXpath) {
        equalsTwoString(messageText, getMessageText(messageXpath));
    }

    public void closeMessage(String crossButtonIndex){
        waitElementAndClick(String.format(CROSS_BUTTON,crossButtonIndex));
    }

    public void checkingInvisibilityofNormalMessage() {
        waitElementIsInvisible(GREEN_NORMAL_MESSAGE_XPATH);
    }

    public void checkingInvisibilityofAutocloseableMessage() {
        waitElementIsInvisible(GREEN_AUTOCLOSEABLE_MESSAGE_XPATH);
    }


    public void clickAlertDialogAutocloseableBoxButton(String buttonText){
        waitElementAndClick(String.format(BUTTON,buttonText));
    }

    public void compareAutocloseableMessageStyles(){
        equalsTwoString(STYLE_IS_DISPLAY_NONE,getMessageStyle(GREEN_AUTOCLOSEABLE_MESSAGE_XPATH));
    }


}
