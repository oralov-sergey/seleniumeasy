package pageObject;

import core.SuperClass;

public class SimpleFormPage extends SuperClass {
    private static final String SHOW_MESSAGE_BUTTON = "//button[@onclick='showInput();']";
    private static final String DISPLAYED_TEXT = "//span[@id='display']";
    private static final String URL = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";
    private static final String USER_MESSAGE_INPUT = "//input[@id='user-message']";

    public void getUrl() {
        getBrowser(URL);
    }


    public void sentTextToUserMessageInput(String textExpected) {
        waitElementAndSendKeys(USER_MESSAGE_INPUT, textExpected);
    }

    public void clickShowMessageButton() {
        waitElementAndClick(SHOW_MESSAGE_BUTTON);
    }

    public String getDisplayedText() {
        return waitElementAndGetText(DISPLAYED_TEXT);
    }

}
