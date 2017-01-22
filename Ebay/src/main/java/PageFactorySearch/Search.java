package PageFactorySearch;

import base.CommonAPI;

/**
 * Created by Zahid on 1/16/2017.
 */
public class Search extends CommonAPI {

    public void collectiblesAndArt() throws InterruptedException {

        //click on ebay Shop by category list
        clickByCss("#gh-shop-a");
        sleepFor(3);


        //clicks on Collectibles & Art
        clickByCss(".gh-sbc-parent>a");
        sleepFor(3);


        clickByCss("#gh-shop-a");
        sleepFor(3);


        //clicks on Collectibles
        clickByXpath(".//*[@id='gh-sbc']/tbody/tr/td[1]/ul[1]/li[1]/a");
        sleepFor(3);

        clickByCss("#gh-shop-a");
        sleepFor(3);


        //clicks on Coins & paper money
        clickByXpath(".//*[@id='gh-sbc']/tbody/tr/td[1]/ul[1]/li[2]/a");
        sleepFor(3);


        clickByCss("#gh-shop-a");
        sleepFor(3);


        //clicks on Antiques
        clickByXpath(".//*[@id='gh-sbc']/tbody/tr/td[1]/ul[1]/li[3]/a");
        sleepFor(3);


        clickByCss("#gh-shop-a");
        sleepFor(3);


        //clicks on Sports memorabilia
        clickByXpath(".//*[@id='gh-sbc']/tbody/tr/td[1]/ul[1]/li[4]/a");
        sleepFor(3);


    }

    public void testHome(){

        clickByXpath(".//*[@id='navigationFragment']/div/table/tbody/tr/td[4]/a");
        clickByXpath(".//*[@id='bc']/li[1]/a");

    }
}
