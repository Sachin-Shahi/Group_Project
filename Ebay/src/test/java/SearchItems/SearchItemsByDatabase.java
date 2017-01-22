package SearchItems;

import methods.CommonMethods;
import methods.CommonMethods;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by DAGR8DON on 1/18/2017.
 */
public class SearchItemsByDatabase extends CommonMethods {

    @Test
    public void testingSearchBarWithDB() throws InterruptedException {

        CommonMethods commonMethodsEbay = PageFactory.initElements(driver, CommonMethods.class);

        commonMethodsEbay.eBaySearchBar();
    }
}
