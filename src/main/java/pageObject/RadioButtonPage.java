package pageObject;

import core.SuperClass;

public class RadioButtonPage extends SuperClass {

    public static final String URL = "https://www.seleniumeasy.com/test/basic-radiobutton-demo.html";
    public static final String MALE = "(//input[contains(@type,'radio')])[1]";
    public static final String CHEKED_TEXT = "//p[@class='radiobutton']";
    public static final String GET_CHECKED_VALUE_BUTTON = "//button[contains(.,'Get Checked value')]";


    public void getUrl() {
        getBrowser(URL);
    }

       public void chooseSexAndClick() {
        waitElementAndClick(MALE);
    }

    public String getCheckedText() {
        return waitElementAndGetText(CHEKED_TEXT);
    }

    public  void clickGetCheckedValueButton(){
        waitElementAndClick(GET_CHECKED_VALUE_BUTTON);
    }

}