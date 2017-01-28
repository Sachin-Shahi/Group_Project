package UITabs.YourAmazon;

import methods.LogInInformation;
import methods.LoginResult;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by DAGR8DON on 1/21/17.
 */
public class YourAmazon extends LogInInformation {
    @Test
    public void testLoginCorrectCredentials(){
        LoginResult login = PageFactory.initElements(driver, LoginResult.class);
        login.SuccessfulLogin(LogInInformation.AmazonUserName, LogInInformation.AmazonPassword);
    }

}
