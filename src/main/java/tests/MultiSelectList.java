package tests;

import core.SuperClass;
import org.junit.Test;

public class MultiSelectList extends SuperClass {
    @Test
    public void selectOneplaceInSelectBox(){

        multiSelectListPage.getUrl();
        otherPage.closeExpectedPopup();
        multiSelectListPage.selectOneplaceInSelectBox();
        multiSelectListPage.clickFirstSelect();
        multiSelectListPage.getDisplayedTextForOneSelect();
        multiSelectListPage.compareResultsForOneSelect();

        }

    @Test
    public void selectSeveralplacesInSelectBox(){
        multiSelectListPage.getUrl();
        multiSelectListPage.selectSeveralPlaces();
        multiSelectListPage.clickGetAllSelected();
        multiSelectListPage.getDisplayedTextForSeveralSelects();
        multiSelectListPage.compareResultsForSeveralSelects();

    }





    }



