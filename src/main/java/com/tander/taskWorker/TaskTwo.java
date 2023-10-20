package com.tander.taskWorker;

import com.tander.models.Employee;
import com.tander.models.InsuranceCompanies;
import com.tander.transformer.JsonToPOJO;
import com.tander.transformer.PojoToJSON;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Arrays;
import java.util.Properties;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskTwo {

    private static final Logger logger = LoggerFactory.getLogger(TaskOne.class);
    Properties properties;
    public void executeTask(){
        String pathJSONFile = properties.getProperty("pojoFileName");
        File jsonFile = new File(pathJSONFile);
        Employee employee = new Employee(1, "Ivan", Arrays.asList("hardskill", "softskill", "java"));
        if(PojoToJSON.transform(employee, jsonFile)){
            logger.info("Task 2 complete.");
        }
        else {
            logger.error("Task 2 not completed.");
        }
    }

}
