package LogIn;

import methods.LogInInformation;
import methods.LoginResult;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by DAGR8DON on 1/25/17.
 */
public class LogInEnv extends LogInInformation{


    @Test(priority = 1)
    public void testLoginCorrectCredentials(){
        LoginResult login = PageFactory.initElements(driver, LoginResult.class);
        login.SuccessfulLogin(LogInInformation.AmazonUserName, LogInInformation.AmazonPassword);
    }
    @Test(priority = 2)
    public void testLoginIncorrectCredentials(){
        LoginResult login = PageFactory.initElements(driver, LoginResult.class);
        login.AmazonLogin("incorrectUserName@unknownDomain.com", "incorrectPassword");
    }
    @Test(priority = 3)
    public void testLoginBlankPassword(){
        LoginResult login = PageFactory.initElements(driver, LoginResult.class);
        login.AmazonLoginNoPassword(LogInInformation.AmazonUserName, "");
    }
    @Test(priority = 4)
    public void testLoginIncorrectPassword(){
        LoginResult login = PageFactory.initElements(driver, LoginResult.class);
        login.AmazonLogin(LogInInformation.AmazonPassword, "incorrectPassword");
    }

}
