package pageObject;

import core.SuperClass;

public class OtherPage extends SuperClass {
    private static final String EXPECTED_POPUP = "//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]";

    public void closeExpectedPopup() {
        try {
            waitElementAndClick(EXPECTED_POPUP);
        } catch (org.openqa.selenium.TimeoutException ex) {
            //no popup
        }
    }

}

