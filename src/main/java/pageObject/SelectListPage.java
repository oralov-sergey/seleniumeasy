package pageObject;

import core.SuperClass;

public class SelectListPage extends SuperClass {

    private static final String URL = "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html";
    private static final String DISPLAYED_TEXT = "//p[contains(@class,'selected-value')]";
    private static final String SELECT_A_DAY_DROPDOWN = "//select[contains(@class,'form-control')]";

    public void getUrl() {
        getBrowser(URL);
    }


    public void selectAdayDropdown (String value) {
        selectValueDropdown(SELECT_A_DAY_DROPDOWN, value);
    }


    public String getDisplayedText() {
        return waitElementAndGetText(DISPLAYED_TEXT);
    }



}

