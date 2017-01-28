package UITabs;

import UITabs.TodaysDeals.Coupons.Coupons;
import UITabs.TodaysDeals.TodaysDeals;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by DAGR8DON on 1/21/17.
 */
public class Tabs extends CommonAPI {

    public TodaysDeals deals() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.deal();
        return PageFactory.initElements(driver, TodaysDeals.class);
    }

    @Test
    public void TestCoupon() throws InterruptedException {
        deals().coupons();
    }

    @Test
    public void Testdeals() throws InterruptedException {
        deals().deals();
    }

    @Test
    public void TestWatchedDeals() throws InterruptedException {
        deals().watchedDeals();
    }
}

