package pageFactoryLogin;

import methods.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by rrt on 9/7/2016.
 */
public class LogInInfo extends CommonMethods{

        WebDriver driver;

        public LogInInfo(WebDriver driver) {
            this.driver = driver;
        }

        By userName = By.cssSelector("#ap_email");
        By Password = By.cssSelector("#ap_password");
        By submit = By.xpath(".//*[@id='signInSubmit']");



    public WebElement EmailID() {
            return driver.findElement(userName);
        }

        public WebElement password() {
            return driver.findElement(Password);
        }

        public WebElement Submit() {
            return driver.findElement(submit);
        }

    @FindBy(how = How.XPATH, using = "html/body/div[3]/div/header/div[1]/ul[1]/li[1]/span/a")
    public static WebElement AccountLogInLink;

    @FindBy(how=How.XPATH, using = "html/body/div[4]/div/div/div/div[5]/div/div[1]/div/div[1]/div[1]/div[2]/div/span/form/div[1]/div[5]/div/div[4]/span[2]/input")
    public static WebElement UserId;

    @FindBy(how=How.XPATH, using = "html/body/div[4]/div/div/div/div[5]/div/div[1]/div/div[1]/div[1]/div[2]/div/span/form/div[1]/div[5]/div/div[5]/span[2]/input")
    public static WebElement UserPass;

    @FindBy(how=How.XPATH, using = "html/body/div[4]/div/div/div/div[5]/div/div[1]/div/div[1]/div[1]/div[2]/div/span/form/div[2]/input")
    public static WebElement LoginSubmit;

    //public void setLogOutLink(){mouseHoverByXpath(".//*[@id='nav-link-yourAccount']/span[2]");}

    @FindBy(how=How.XPATH, using = "html/body/div[1]/div[1]/div[3]/div/div/form/div/div/div/div[3]/span/span/input")
    public static WebElement LogoutSubmit;

    public void EbayLogin(String userID, String userPass)
    {
        AccountLogInLink.click();;
        UserId.sendKeys(userID);
        UserPass.sendKeys(userPass);
        LoginSubmit.click();
    }

    }
