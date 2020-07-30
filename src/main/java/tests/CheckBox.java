package tests;

import core.SuperClass;
import org.junit.Test;

public class CheckBox extends SuperClass {
    @Test
    public void singleCheckboxDemo() {
        checkBoxPage.getUrl();
        checkBoxPage.closeExpectedPopup();
        checkBoxPage.clickSingleCheckBox();
        //String abc = checkBoxPage.getCheckedText();
        //equalsTwoString("Success - Check box is checked", abc);
        equalsTwoString("Success - Check box is checked", checkBoxPage.getCheckedText());
    }

}