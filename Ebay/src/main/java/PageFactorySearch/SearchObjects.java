package PageFactorySearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Zahid on 1/17/2017.
 */
public class SearchObjects {

    WebDriver pageObjectDriver;

    public SearchObjects(WebDriver driver){
        this.pageObjectDriver=driver;
    }


    @FindBy(id = "gh-shop-a")
    public WebElement shopByCategory;

    @FindBy(how = How.CSS, using = ".gh-sbc-parent>a")
    public WebElement collectiblesAndArt;

    @FindBy(how = How.XPATH, using = ".//*[@id='mainContent']/div[3]/ul/div/li[1]/ul/li[1]/a")
    public WebElement antiques;

    @FindBy(how = How.XPATH, using = ".//*[@id='mainContent']/div[3]/ul/div/li[1]/ul/li[1]/ul/a")
    public WebElement shopAntiques;

    @FindBy(how = How.LINK_TEXT, using = "eBay")
    public WebElement eBayReturnToHomePageLink;

}
