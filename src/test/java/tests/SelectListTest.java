package tests;

import core.SuperClass;
import org.junit.Test;

public class SelectListTest extends SuperClass {
    @Test
    public void selectADayFromDropdown(){
        String day = "Friday";
        String expectedDay = String.format("Day selected :- %s",day);

        selectListPage.getUrl();
        otherPage.closeExpectedPopup();
        selectListPage.selectAdayDropdown(day);
        selectListPage.getDisplayedText();
        String actualText = selectListPage.getDisplayedText();
        equalsTwoString(expectedDay, actualText);
    }


}
