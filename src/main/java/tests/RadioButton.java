package tests;

import core.SuperClass;
import org.junit.Test;

public class RadioButton extends SuperClass {
     @Test
     public void radioButton() {
     radioButtonPage.getUrl();
     otherPage.closeExpectedPopup();
     radioButtonPage.chooseSexAndClick();
     radioButtonPage.clickGetCheckedValueButton();
     radioButtonPage.getCheckedText();
     equalsTwoString("Radio button 'Male' is checked",radioButtonPage.getCheckedText());
 }


}
