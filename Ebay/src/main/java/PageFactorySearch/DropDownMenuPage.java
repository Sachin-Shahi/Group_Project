package PageFactorySearch;

import base.CommonAPI;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mrahman on 1/8/17.
 */
public class DropDownMenuPage extends CommonAPI{

    public List<String> getMenus(){
        List<String> items = new ArrayList<String>();
        items = getTextFromWebElements("html/body/div[4]/div/div/div[1]/div[1]/div/table/tbody/tr/td[4]/div[2]/div[1]/ul[1]/li");

        return items;
    }

    public void typeOnInputSearch(List<String> data)throws InterruptedException{
        for(int i=0; i<5; i++) {
            typeByCss("#twotabsearchtextbox", data.get(i));
            input();
            sleepFor(2);
            clearBox();
        }
    }

    public void input() {
        keysInput("#twotabsearchtextbox");
    }
    public void clearBox() {
        clearInput("#twotabsearchtextbox");
    }
}
