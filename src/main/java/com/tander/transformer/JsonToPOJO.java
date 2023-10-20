package com.tander.transformer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.istack.internal.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class JsonToPOJO {
    private static final Logger logger = LoggerFactory.getLogger(JsonToPOJO.class);

    @Nullable
    public static <T> T transform(Class<T> targetClass, File jsonFile){
        logger.info("Start transform JSON to POJO.");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(jsonFile, targetClass);
        }
        catch (IOException e){
            logger.error("Error while create POJO from json: ", e);
        }
        return null;
    }
}
