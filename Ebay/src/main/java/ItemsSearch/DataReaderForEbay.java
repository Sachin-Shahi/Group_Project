package ItemsSearch;


import utility.DataReader ;

import java.io.IOException;


/**
 * Created by furqan on 1/14/2017.
 */
public class DataReaderForEbay {
    DataReader dr = new DataReader();
    public String[] getAddress() throws IOException {
        String path= System.getProperty("user.dir")+"/data/dataToSearch.xls";
        String [] st=dr.fileReader(path,1);
        return st;
    }

    public String[] getFoodType() throws IOException{
        String path= System.getProperty("user.dir")+"/data/dataToSearch.xls";
        String [] st=dr.fileReader(path,2);
        return st;
    }
}
