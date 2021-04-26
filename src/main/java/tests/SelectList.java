package tests;

import core.SuperClass;
import org.junit.Test;

public class SelectList extends SuperClass {
    @Test
    public void selectADayFromDropdown(){
        String day = "Friday";
        String expectedDay = String.format("Day selected :- %s",day);

        selectListPage.getUrl();
        selectListPage.selectAdayDropdown(day);
        selectListPage.getDisplayedText();
        String actualText = selectListPage.getDisplayedText();
        equalsTwoString(expectedDay, actualText);
    }


}
