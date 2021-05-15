package tests;

import core.SuperClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BootstrapAlertMessage extends SuperClass {
    private String color;
    private String messageXpath;
    private String messageText;
    private String buttonXpath;
    private String crossButtonIndex;


    public BootstrapAlertMessage(String color, String messageXpath, String messageText, String buttonXpath, String crossButtonIndex) {
        this.color = color;
        this.messageXpath = messageXpath;
        this.messageText = messageText;
        this.buttonXpath = buttonXpath;
        this.crossButtonIndex = crossButtonIndex;
    }

    @Parameterized.Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(new Object[][] {
                { "#dff0d8", "//div[@class='alert alert-success alert-normal-success']", "×\nI'm a normal success message. To close use the appropriate button.","Normal success message", "1" },
                { "#fcf8e3", "//div[@class='alert alert-warning alert-normal-warning']", "×\nI'm a normal warning message. To close use the appropriate button.", "Normal warning message", "2" },
                { "#f2dede", "//div[@class='alert alert-danger alert-normal-danger']", "×\nI'm a normal danger message. To close use the appropriate button.", "Normal danger message", "3" },
                { "#d9edf7", "//div[@class='alert alert-info alert-normal-info']", "×\nI'm a normal info message. To close use the appropriate button.", "Normal info message", "4" }
        });
    }
    @Test
    public void verifyBackgroundColors(){
        bootstrapAlertMessegePage.getUrl();
        bootstrapAlertMessegePage.clickAlertDialogBoxButton(buttonXpath);
        bootstrapAlertMessegePage.compareColors(color, messageXpath);
        bootstrapAlertMessegePage.comareTexts(messageText, messageXpath);
        bootstrapAlertMessegePage.closeMessage(crossButtonIndex);
        //bootstrapAlertMessegePage.checkingInvisibilityofNormalMessage();

    }
    @Test
    public void verifyAutocloseableMessage(){
        bootstrapAlertMessegePage.getUrl();
        bootstrapAlertMessegePage.clickAlertDialogAutocloseableBoxButton("Autocloseable success message");
        staticWait(10);
        bootstrapAlertMessegePage.compareAutocloseableMessageStyles();

        //bootstrapAlertMessegePage.checkingInvisibilityofAutocloseableMessage();
    }
}
