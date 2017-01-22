package ItemsSearch;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by furqan on 1/13/2017.
 */
public class EbaySearch extends CommonMethods {
@FindBy(how= How.XPATH,using= ".//*[@id='ghs-start-order-new-address-input']/input")
    public static WebElement addressBar;

@FindBy(how=How.XPATH,using=".//*[@id='ghs-outerWrapper']/div[2]/div/ghs-homepage/div/div/div[2]/div[1]/form/ghs-start-order-form/div/div[2]/div[3]/input")
    public static WebElement searchBar;

@FindBy(how=How.XPATH,using=".//*[@id='ghs-startOrder-searchBtn']")
    public static WebElement findItem;

public void searchUsingAddBarFoodBar(String Address,String Food) throws InterruptedException {
    addressBar.sendKeys(Address);
    sleepFor(3);
    searchBar.sendKeys(Food);
    //sleepFor(5);
    findItem.click();
    sleepFor(5);
}

}
