package SearchItems;

import PageFactorySearch.Search;
import org.testng.annotations.Test;

/**
 * Created by DAGR8DON on 1/16/2017.
 */
public class Home extends Search {

    @Test
    public void eBaySearch()throws InterruptedException {

        collectiblesAndArt();
    }

    @Test
    public void eBayHome(){

        testHome();
    }
}
