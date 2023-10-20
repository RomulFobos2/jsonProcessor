package com.tander.taskWorker;

import com.tander.JsonProcessorApp;
import com.tander.models.InsuranceCompanies;
import com.tander.transformer.JsonToPOJO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Properties;

@Getter
@Setter
@AllArgsConstructor
public class TaskOne {
    private static final Logger logger = LoggerFactory.getLogger(TaskOne.class);

    Properties properties;
    public void executeTask(){
        String pathJSONFile = properties.getProperty("jsonFileName");
        File jsonFile = new File(pathJSONFile);
        if (!jsonFile.exists()) {
            logger.error("JSON file not found at path: " + pathJSONFile + " .");
            return;
        }
        InsuranceCompanies insuranceCompanies = JsonToPOJO.transform(InsuranceCompanies.class, jsonFile);
        if(insuranceCompanies != null){
            logger.info(insuranceCompanies.toString());
        }
        else {
            logger.info("Invalid or incomplete data in JSON file - " + pathJSONFile + ".");
        }
    }

}
