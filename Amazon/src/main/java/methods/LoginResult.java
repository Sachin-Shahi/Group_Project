package methods;

import methods.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static methods.LogInInformation.Amazon;


/**
 * Created by Bilal on 18-01-2017.
 */
public class LoginResult extends CommonMethods {
    @FindBy(how = How.XPATH, using = ".//*[@id='nav-link-accountList']/span[1]")
    public static WebElement AccountLogInLink;

    @FindBy(how=How.XPATH, using = ".//*[@id='ap_email']")
    public static WebElement UserId;

    @FindBy(how=How.XPATH, using = ".//*[@id='ap_password']")
    public static WebElement UserPass;

    @FindBy(how=How.XPATH, using = ".//*[@id='signInSubmit']")
    public static WebElement LoginSubmit;

    @FindBy(how = How.XPATH, using = ".//*[@id='auth-error-message-box']/div/h4")
    public static WebElement errorCredentials;

    @FindBy(how = How.XPATH, using = ".//*[@id='hud-customer-name']/div/a")
    public static WebElement homepageFullName;

    @FindBy(how=How.XPATH, using =".//*[@id='auth-password-missing-alert']/div/div")
    public static WebElement EnterPassword;


    public void AmazonLogin(String userID, String userPass)
    {
        AccountLogInLink.click();;
        UserId.sendKeys(userID);
        UserPass.sendKeys(userPass);
        LoginSubmit.click();
        errorCredentials.isDisplayed();
    }
    public void SuccessfulLogin(String userID, String userPass){
        AccountLogInLink.click();
        UserId.sendKeys(userID);
        UserPass.sendKeys(userPass);
        LoginSubmit.click();
        Assert.assertTrue(homepageFullName.getText().equals(Amazon));
    }
    public void AmazonLoginNoPassword(String userID, String userPass)
    {
        AccountLogInLink.click();;
        UserId.sendKeys(userID);
        UserPass.sendKeys(userPass);
        LoginSubmit.click();
        EnterPassword.isDisplayed();
    }




}
