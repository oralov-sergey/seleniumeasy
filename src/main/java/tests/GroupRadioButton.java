package tests;

import core.SuperClass;
import org.junit.Test;
import pageObject.GroupRadioButtonPage;

public class GroupRadioButton extends SuperClass {

    @Test
    public void groupRadioButton() {
        groupRadioButtonPage.getUrl();
        otherPage.closeExpectedPopup();
        groupRadioButtonPage.chooseSexAndClik("Female");
        groupRadioButtonPage.chooseAgeAndClick("5 to 15");
        groupRadioButtonPage.clikGetValue();
        groupRadioButtonPage.getCheckingText();

       equalsTwoString("Sex : Female\n" + "Age group: 5 - 15",groupRadioButtonPage.getCheckingText());

    }
}
