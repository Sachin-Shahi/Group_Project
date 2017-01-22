package LogIn;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageFactoryLogin.LogInInfo;

/**
 * Created by DAGR8DON on 1/21/17.
 */
public class LogInPage extends CommonAPI {
    @Test
    public void LogIn(){
        LogInInfo login= PageFactory.initElements(driver,LogInInfo.class);
        login.EbayLogin("Sachin","Hello");
    }

}
