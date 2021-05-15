package pageObject;

import core.SuperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MultiSelectListPage extends SuperClass {

    private static final String URL = "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html";
    
    
    private static String [] places = {"California","Florida","New Jersey","New York","Ohio","Texas","Pennsylvania","Washington"};
    private static String expectedPlaceForOneSelect = String.format("First selected option is : %s",places[0]);
    private static String expectedPlacesForSeveralSelects = String.format("Options selected are : %s",places[1]+","+places[4]+","+places[5]);
    private static final String DISPLAYED_TEXT_FOR_ONE_SELECT = String.format("//p[@class='getall-selected'][contains(.,'First selected option is : %s')]",places[0]);
    private static final String SELECT_A_PLACE = "//*[@id=\"multi-select\"]";
    private static final String FIRST_SELECTED_BUTTON = "(//button[@type='button'])[2]";
    private static final String GET_ALL_SELECTED_Button = "(//button[@type='button'])[3]";
    private static final String SELECT_SEVERAL_PLACES = "//option[@value='%s']";
    private static final String DISPLAYED_TEXT_FOR_SEVERAL_SELECTS = String.format("//p[contains(.,'Options selected are : %s')]",places[1]+","+places[4]+","+places[5]);

    public void getUrl() {
        getBrowser(URL);
    }


    public void selectOneplaceInSelectBox () {
        selectValueDropdown(SELECT_A_PLACE, places[0]);
    }

    public void clickFirstSelect(){
        waitElementAndClick(FIRST_SELECTED_BUTTON);
    }

    public String getDisplayedTextForOneSelect() {
        return waitElementAndGetText(DISPLAYED_TEXT_FOR_ONE_SELECT);
    }

    public void compareResultsForOneSelect(){
        equalsTwoString(expectedPlaceForOneSelect, getDisplayedTextForOneSelect());
    }

    public void selectSeveralPlaces(){
        scrollIntoView(String.format(SELECT_SEVERAL_PLACES,places[1]));
        pressCtrlAndSelectSeveralElementsUsingFormat(SELECT_SEVERAL_PLACES,places[1]);
        pressCtrlAndSelectSeveralElementsUsingFormat(SELECT_SEVERAL_PLACES,places[4]);
        pressCtrlAndSelectSeveralElementsUsingFormat(SELECT_SEVERAL_PLACES,places[5]);
    }


    public void clickGetAllSelected (){
        waitElementAndClick(GET_ALL_SELECTED_Button);
    }

    public String getDisplayedTextForSeveralSelects() {
        return waitElementAndGetText(DISPLAYED_TEXT_FOR_SEVERAL_SELECTS);
    }

    public void compareResultsForSeveralSelects(){
        equalsTwoString(expectedPlacesForSeveralSelects, getDisplayedTextForSeveralSelects());
    }

   }












