package CheckCart;

import PageFactorySearch.SearchObjects;
import methods.CommonMethods;
import methods.LoginResult;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by DAGR8DON on 1/27/17.
 */
public class CheckCart extends CommonMethods {
@Test
    public void TestCart() throws InterruptedException {
    SearchObjects searchObjects = PageFactory.initElements(driver, SearchObjects.class);
    searchObjects.TestCart();

}
}
