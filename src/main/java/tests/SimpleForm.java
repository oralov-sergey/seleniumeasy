package tests;

import core.SuperClass;
import org.junit.Test;

public class SimpleForm extends SuperClass {

 @Test
 public void singleInputField() {
     String textExpected = "Test1";
     simpleFormPage.getUrl();
     simpleFormPage.closeExpectedPopup();
     simpleFormPage.sentTextToUserMessageInput(textExpected);
     simpleFormPage.clickShowMessageButton();
     String actualText = simpleFormPage.getDisplayedText();
     equalsTwoString(textExpected, actualText);
     // well done
 }
@Test
 public void twoInputFields() {
     String num1 = "5";
     String num2 = "6";
     int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
     String sumString = String.valueOf(sum);

     getBrowser("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
     waitElementAndClick("//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]");
     waitElementAndSendKeys("//input[contains(@id,'sum1')]", num1);
     waitElementAndSendKeys("//input[contains(@id,'sum2')]", num2);
     waitElementAndClick("//button[@onclick='return total()']");
     String actualText = waitElementAndGetText("//span[contains(@id,'displayvalue')]");
     equalsTwoString(sumString, actualText);
     // before well done
 }





}
