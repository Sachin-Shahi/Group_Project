package SearchItems;

import base.CommonAPI;
import methods.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 * Created by DAGR8DON on 1/27/17.
 */
public class MouseHover extends CommonMethods{
    @Test
    public void MouseHover() throws InterruptedException {
        mouseHoverByXpath(".//*[@id='nav-link-shopall']/span[2]",".//*[@id='nav-flyout-shopAll']/div[2]/span[1]",".//*[@id='nav-flyout-shopAll']/div[3]/div[1]/div[1]/div/a[1]/span[1]");
    }
}

