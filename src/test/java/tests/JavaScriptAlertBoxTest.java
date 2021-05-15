package tests;

import core.SuperClass;
import org.junit.Test;

public class JavaScriptAlertBoxTest extends SuperClass {
    @Test
    public void javaScriptAlertBox() {
        javaScriptAlertBoxPage.getUrl();
        otherPage.closeExpectedPopup();
        javaScriptAlertBoxPage.clickToDisplayAnAlertBox();
        javaScriptAlertBoxPage.switchToAlertAndAccept();

    }

    @Test
    public void javaScriptConfirmBox() {
        javaScriptAlertBoxPage.getUrl();
        otherPage.closeExpectedPopup();
        javaScriptAlertBoxPage.clickToDisplayAnAlertConfirmBox();
        javaScriptAlertBoxPage.switchToAlertAndAccept();
        javaScriptAlertBoxPage.getDisplayedTextConffirmBox();
        javaScriptAlertBoxPage.comparePositiveResultsConfirmBox();
        javaScriptAlertBoxPage.clickToDisplayAnAlertConfirmBox();
        javaScriptAlertBoxPage.switchToAlertAndDismiss();
        javaScriptAlertBoxPage.compareNegativeResultsConfirmBox();
    }

    @Test
    public void javaScriptAlertPromptBox() {
        javaScriptAlertBoxPage.getUrl();
        javaScriptAlertBoxPage.clickToDisplayAnAlertPromptBox();
        javaScriptAlertBoxPage.switchToAlertAndDismiss();
        javaScriptAlertBoxPage.clickToDisplayAnAlertPromptBox();
        javaScriptAlertBoxPage.switchToAlertWriteNameAndAccept();
        javaScriptAlertBoxPage.comparePositiveResultsPromptBox();


    }
}