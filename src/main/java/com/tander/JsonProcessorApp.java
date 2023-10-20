package com.tander;

import com.tander.models.InsuranceCompanies;
import com.tander.taskWorker.TaskOne;
import com.tander.taskWorker.TaskTwo;
import com.tander.transformer.JsonToPOJO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class JsonProcessorApp {
    private static final Logger logger = LoggerFactory.getLogger(JsonProcessorApp.class);

    public static void main(String[] args) {
        Properties properties = new Properties();
        String pathFileProperties = args.length == 0 ? "config.properties" : args[0];
        logger.info("Properties file: " + pathFileProperties);
        try {
            properties.load(new FileReader(pathFileProperties));
            logger.info("Properties file load.");
            logger.info("------------Execute task 1------------");
            TaskOne taskOne = new TaskOne(properties);
            taskOne.executeTask();

            logger.info("------------Execute task 2------------");
            TaskTwo taskTwo = new TaskTwo(properties);
            taskTwo.executeTask();
        } catch (IOException e) {
            logger.error("Error while reading properties file: ", e);
        }
    }
}