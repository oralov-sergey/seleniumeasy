package tests;

import core.SuperClass;
import org.junit.Test;

public class WindowPopupTest extends SuperClass {
    @Test
    public void windowpopup(){
        windowPopupPage.getUrl();
        otherPage.closeExpectedPopup();
        windowPopupPage.clickFollowOnTwitterButton();
        windowPopupPage.switchToWindowPopUp(1);
        windowPopupPage.compareResults();
        windowPopupPage.enterNumber();


    }
}
