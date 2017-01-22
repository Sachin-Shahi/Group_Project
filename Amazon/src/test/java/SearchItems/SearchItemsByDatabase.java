package SearchItems;

import PageFactorySearch.SearchItems;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import utility.ConnectDB;
import  org.testng.annotations.Test;

import java.util.List;

/**
 * Created by PIIT_NYA on 1/14/2017.
 */
public class SearchItemsByDatabase extends CommonAPI {

    @Test
    public void searchUsingDB()throws Exception,InterruptedException{
        //initialize Search page factory
        SearchItems search = PageFactory.initElements(driver, SearchItems.class);
        //Read Data From Database
        ConnectDB db = new ConnectDB();
        List<String> st = db.readDataBase();
        for(String data:st) {
            search.searchFor(data);
            sleepFor(2);
            search.clearSearchInput();
        }
    }
}
