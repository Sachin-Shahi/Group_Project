package Tabs.TodaysDeals;

import Tabs.TodaysDeals.Coupons.Coupons;
import Tabs.TodaysDeals.WatchedDeals.WatchedDeals;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import Tabs.TodaysDeals.Deals.Deals;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DAGR8DON on 1/21/17.
 */
public class TodaysDeals {
    @FindBy(how = How.XPATH, using = "html/body/div[1]/header/div/div[3]/a")
    List<WebElement> elements = new ArrayList<WebElement>();

    public Deals deals(){
        elements.get(0).click();
        return new Deals();
    }

    public WatchedDeals watchedDeals(){
        elements.get(1).click();
        return new WatchedDeals();
    }

    public Coupons coupons(){
        elements.get(2).click();
        return new Coupons();
    }

}
