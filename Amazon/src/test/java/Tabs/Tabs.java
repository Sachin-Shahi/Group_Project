package Tabs;

import Tabs.TodaysDeals.TodaysDeals;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import Tabs.HomePage;
import Tabs.TodaysDeals.TodaysDeals;

/**
 * Created by DAGR8DON on 1/21/17.
 */
public class Tabs extends CommonAPI {
    @Test
    public void testHeader() throws InterruptedException {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
         TodaysDeals deals = PageFactory.initElements(driver, TodaysDeals.class);
        homePage.deal();
        sleepFor(3);
       deals.coupons();
    }
}
