package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configReader {

    public static  String getReportConfigPath() throws IOException {

        FileInputStream fp = new FileInputStream("Config\\Configuration.properties");
        Properties prop = new Properties();
        prop.load(fp);
        String reportConfigPath = prop.getProperty("reportConfigPath");
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }
}
