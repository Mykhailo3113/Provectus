package com.testapp.utils;

import com.testapp.parameters.ConfigurationParameters;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertiesUtils {

    private static final Logger LOGGER = Logger.getLogger(PropertiesUtils.class.getName());

    public static ConfigurationParameters getProperties() {

        ConfigurationParameters configurationParameters = new ConfigurationParameters();
        String propertiesFile = "application.properties";
        try {
            Properties properties = PropertiesLoaderUtils.loadAllProperties(propertiesFile);
            configurationParameters.setUrl(properties.getProperty("book.baseUrl"));
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Cannot load application.properties file!");
        }
        return configurationParameters;
    }
}
