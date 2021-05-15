package pageObject;

import core.SuperClass;

public class WindowPopupPage extends SuperClass {

    private static final String URL = "https://www.seleniumeasy.com/test/window-popup-modal-demo.html";
    private static final String FOLLOW_ON_TWITTER_BUTTON_XPATH = "(//a[contains(@class,'btn btn-primary followeasy')])[1]";
    private static final String CHECKING_URL = "https://twitter.com/intent/follow?screen_name=seleniumeasy";
    private static final String PHONE_FIELD = "(//input[@autocomplete='on'])[1]";

    public void getUrl(){
        getBrowser(URL);
    }

    public void clickFollowOnTwitterButton(){
        waitElementAndClick(FOLLOW_ON_TWITTER_BUTTON_XPATH);
    }


   public void compareResults(){
        equalsTwoString(CHECKING_URL, getCurrentURL());
   }

   public void enterNumber(){
        waitElementAndSendKeys(PHONE_FIELD,"5555");
   }




}
