package SearchItems;

import ItemsSearch.SearchUtilities;
import base.CommonAPI;
import dataToSearch.ItemsToBeSearched;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by PIIT_NYA on 1/14/2017.
 */
public class SearchItemsByExcel extends CommonAPI {

    @Test
    public void search()throws IOException,InterruptedException{
        //Create instance of Excel file reader class
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        //Page Factory class init
        PageFactorySearch.SearchItems search = PageFactory.initElements(driver, PageFactorySearch.SearchItems.class);
        //Read data from Excel File.
        String [] value = itemsToBeSearched.getData();
        //Running for each loop
        for(int i=1; i<value.length; i++) {
            search.searchFor(value[i]);
            sleepFor(2);
            search.clearSearchInput();
        }
    }
}
