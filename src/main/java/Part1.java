import org.junit.Test;

public class Part1 extends SuperClass {

 @Test
 public void Test() {
     String textExpected = "Test1";
     getBrowser("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
     waitElementAndClick("//*[@id=\"at-cv-lightbox-button-holder\"]/a[2]");
     waitElementAndSendKeys("//input[@id='user-message']", textExpected);
     waitElementAndClick("//button[@onclick='showInput();']");
     String actualText = waitElementAndGetText("//span[@id='display']");
     equalsTwoString(textExpected, actualText);
     //TEST
 }
@Test
 public void Test2() {
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
 }




}
