package PageFactorySearch;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static methods.LogInInformation.Amazon;

public class SearchObjects extends CommonAPI{
    WebDriver pageObjectDriver;

    @FindBy(id="searchDropdownBox")
    public WebElement dropdownBox;

    @FindBy(how = How.CSS, using = ".nav-input")
    public WebElement searchSubmit ;

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchField;

    @FindBy(xpath = ".//*[@id='result_2']/div/div/div/div[2]/div[2]/div[1]/a/h2")
    public WebElement getBook;

    @FindBy(id = "add-to-cart-button")
    public WebElement addToCartBtn;

    @FindBy(xpath = ".//*[@id='huc-v2-order-row-confirm-text']/h1")
    public WebElement checkCart;

       // This constructor calls initelements method of PageFactory class. initelements method will create the WebElements declared in this class
    public SearchObjects(WebDriver driver) {
        this.pageObjectDriver=driver;
        PageFactory.initElements(driver, this);
    }

    public void TestCart() throws InterruptedException {
        searchField.sendKeys("Selenium Text Book");
        searchSubmit.click();
        getBook.click();
        sleepFor(2);
        addToCartBtn.click();
        Assert.assertTrue(checkCart.getText().equals("Added to Cart"));



    }

}
