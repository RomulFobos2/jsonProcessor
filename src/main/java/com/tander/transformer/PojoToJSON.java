package com.tander.transformer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class PojoToJSON {
    private static final Logger logger = LoggerFactory.getLogger(PojoToJSON.class);

    public static boolean transform(Object targetObject, File jsonFile){
        logger.info("Start transform POJO to JSON.");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        try (FileWriter fileWriter = new FileWriter(jsonFile)){
            String json = objectMapper.writeValueAsString(targetObject);
            fileWriter.write(json);
            logger.info("Transform POJO to JSON successes.");
            return true;
        }
        catch (JsonProcessingException e){
            logger.error("Error while transform to JSON: ", e);
            return false;
        }
        catch (IOException e){
            logger.error("Error while writing to file: ", e);
            return false;
        }

    }
}
