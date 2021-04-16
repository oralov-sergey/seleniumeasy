package tests;

import core.SuperClass;
import org.junit.Test;

public class CheckBox extends SuperClass {
    @Test
    public void singleCheckbox() {
        checkBoxPage.getUrl();
        otherPage.closeExpectedPopup();
        checkBoxPage.clickSingleCheckBox();
        //String abc = checkBoxPage.getCheckedText();
        //equalsTwoString("Success - Check box is checked", abc);
        equalsTwoString("Success - Check box is checked", checkBoxPage.getCheckedText());
    }
    @Test
    public void multipleCheckbox(){
        checkBoxPage.getUrl();
        otherPage.closeExpectedPopup();
        checkBoxPage.clickCheckAll();//where is "driver.findElement". How did we write it? Look at the "SuperClass - waitElementAndClick"
                //how to check and compare?

          //need more information to understand how to solve
    }
}