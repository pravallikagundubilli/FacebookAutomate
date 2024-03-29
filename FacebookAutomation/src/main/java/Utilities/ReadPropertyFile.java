package Utilities;

import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {

    public static String getProperty1(String key) throws Exception {
        String filePath= System.getProperty("user.dir")+"/src/main/resources/configfiles/config.properties";
        FileInputStream fr=new FileInputStream(filePath);
        Properties pro = new Properties();
        pro.load(fr);
        String value =pro.get(key).toString();
        if(StringUtils.isEmpty(value))
        {
            throw new Exception("value is not specified for key: "+key+" in propertiesFile");
        }
        return  value;
    }


}