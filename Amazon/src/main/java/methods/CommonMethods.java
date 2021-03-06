package methods;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.ConnectDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rrt on 9/7/2016.
 */
public class CommonMethods extends CommonAPI {

    @FindBy(how = How.CSS, using = "#twotabsearchtextbox")
    public static WebElement searchInput;

    @FindBy(how = How.CSS, using = ".nav-input")
    public static WebElement searchSubmit ;

        public boolean isAlreadyLogIn = false;
        public ResultSet rs = null;
        Connection connect = null;
        Statement statement = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;

        public void UserLogin() throws Exception {

           // String[] userCre = loginCredential(); // To get the module login details

            if (!isAlreadyLogIn) {
                clickByXpath(".//*[@id='nav-link-yourAccount']/span[2]");
                sleepFor(2);
                typeByXpath(".//*[@id='ap_email']", "nahreen789@gmail.com");
                sleepFor(2);
                typeByXpath(".//*[@id='ap_password']", "0606440");
                sleepFor(2);
                clickByXpath(".//*[@id='signInSubmit']");
                sleepFor(2);
                isAlreadyLogIn = true;
            }

        }
    public void eBaySearchBar() throws Exception {

        ConnectDB connectDB = new ConnectDB();

        //List<String> list = new ArrayList<String>();

        List<String> st = connectDB.readDataBase("SearchItemsForEbay", "searchitems");

        //List<String> st = db.readDataBase();
        for (String data : st) {
            searchInput.sendKeys(data);
            sleepFor(2);
            searchSubmit.click();
            searchInput.clear();

        }
    }



    public void scrollDown() {
        ((JavascriptExecutor) driver).executeScript("scroll(0, 3000)");
    }
    public void scrollUp() {
        ((JavascriptExecutor) driver).executeScript("scroll(0, -3000)");
    }

    public void mouseHoverByXpath(String locator) {
        try {
            WebElement element = driver.findElement(By.xpath(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        } catch (Exception ex) {
            System.out.println("First attempt has been done, This is second try");
            WebElement element = driver.findElement(By.cssSelector(locator));
            Actions action = new Actions(driver);
            action.moveToElement(element).perform();
        }
    }
    public void mouseHoverByXpath(String locator1, String locator2, String locator3) throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement mainMenu = driver.findElement(By.xpath(locator1));
        actions.moveToElement(mainMenu).perform();
        sleepFor(2);

        WebElement subMenu = driver.findElement(By.xpath(locator2));
        actions.moveToElement(subMenu);
        actions.perform();
        sleepFor(2);

        WebElement subMenu2 = driver.findElement(By.xpath(locator3));
        actions.moveToElement(subMenu2);
        actions.click().build().perform();
        sleepFor(2);
    }
}
