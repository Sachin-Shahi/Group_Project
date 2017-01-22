package Tabs;

import Tabs.GiftCards.GiftCards;
import Tabs.Help.Help;
import Tabs.Sell.Sell;
import Tabs.TodaysDeals.TodaysDeals;
import Tabs.YourAmazon.YourAmazon;
import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DAGR8DON on 1/21/17.
 */
public class HomePage extends CommonAPI{
    @FindBy(how = How.XPATH, using = "html/body/div[1]/header/div/div[2]/div[3]/div/div/a")
    List<WebElement> elements = new ArrayList<WebElement>();

    public YourAmazon yourAmazon(){
        elements.get(0).click();
        return new YourAmazon();
    }
    public TodaysDeals deal(){
        elements.get(1).click();
        return new TodaysDeals();

    }    public GiftCards giftCards(){
        elements.get(2).click();
        return new GiftCards();

    }    public Sell sell(){
        elements.get(3).click();
        return new Sell();
    }
    public Help help(){
        elements.get(4).click();
        return new Help();
    }
}
