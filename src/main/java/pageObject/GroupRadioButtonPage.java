package pageObject;

import core.SuperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

public class GroupRadioButtonPage extends SuperClass {

    public static final String URL = "https://www.seleniumeasy.com/test/basic-radiobutton-demo.html";
    public static final String CHOOSE_SEX = "(//label[@class='radio-inline'][contains(.,'%s')])[2]";

    public static final String AGE_GROUP = "//label[@class='radio-inline'][contains(.,'%s')]";
    public static final String CHEKING_TEXT = "//p[contains(.,'Sex : Female Age group: 5 - 15')]";
    public static final String GET_VALUES = "//button[@type='button'][contains(.,'Get values')]";


    public void getUrl() {
        getBrowser(URL);
    }

    public void chooseSexAndClik(String name){
        waitElementAndClickUsingFormat(CHOOSE_SEX, name);
    }
    public void chooseAgeAndClick(String name){
        waitElementAndClickUsingFormat(AGE_GROUP, name);
    }
    public void clikGetValue(){
        waitElementAndClick(GET_VALUES);
    }
    public String getCheckingText() {
        return waitElementAndGetText(CHEKING_TEXT);}


      /* public void compareChekedText(){
        equalsTwoString("Sex : "+getCheckingText(CHOOSE_SEX,"Female")+"\n" + "Age group:"+),groupRadioButtonPage.getCheckingText());
            System.out.println(getCheckingText());
        }*/



}

