package managers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    public ConfigReader(String app) throws IOException {
        String configPropPath = "D:\\QA_Testing\\MavenBoot\\src\\test\\resources\\props\\"+app+".properties";
        BufferedReader bfReader;

        bfReader = new BufferedReader(new FileReader(configPropPath));
        properties = new Properties();
        properties.load(bfReader);

    }

    public String getPropertyValue(String key) {
        return properties.getProperty(key);
    }


}
