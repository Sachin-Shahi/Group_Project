package SearchItems;

import PageFactorySearch.SearchObjects;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by DAGR8DON on 1/17/2017.
 */
public class SearcheBayObject extends CommonAPI {

    @Test
    public void eBaySearch() throws InterruptedException {

        SearchObjects searchObjects = PageFactory.initElements(driver, SearchObjects.class);

        searchObjects.shopByCategory.click();
        searchObjects.collectiblesAndArt.click();
        sleepFor(2);
        searchObjects.antiques.click();
        sleepFor(1);
        searchObjects.shopAntiques.click();
        sleepFor(1);
        searchObjects.eBayReturnToHomePageLink.click();
    }
}
