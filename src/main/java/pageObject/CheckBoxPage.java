package pageObject;

import core.SuperClass;

public class CheckBoxPage extends SuperClass {
    private static final String SINGLE_CHECKBOX = "//input[contains(@id,'isAgeSelected')]";
    private static final String URL = "https://www.seleniumeasy.com/test/basic-checkbox-demo.html";

    private static final String CHECKED_TEXT = "//div[contains(@id,'txtAge')]";
    public static final String CHECK_ALL = "//input[contains(@id,'check1')]";


    public void getUrl() {
        getBrowser(URL);
    }



    public void clickSingleCheckBox() { waitElementAndClick(SINGLE_CHECKBOX); }


    public String getCheckedText() {
        return waitElementAndGetText(CHECKED_TEXT);
    }

    public void clickCheckAll() {waitElementAndClick(CHECK_ALL);}

}

