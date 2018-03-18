package com.sepick.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * Created by Vinod on 3/10/2018.
 */
public class SepickCoreUtils {

    public static ApplicationContext getApplicationContext() {
        ApplicationContext context = new ClassPathXmlApplicationContext(SepickConstants.SEPICK_APP_CONTEXT_FILE);
        return context;
    }

    public static String getPropertyValue(String key) throws IOException {
        Resource resource = new ClassPathResource(SepickConstants.SEPICK_PROPERTIES_FILE);
        Properties props = PropertiesLoaderUtils.loadProperties(resource);
        return props.getProperty(key);
    }

}
