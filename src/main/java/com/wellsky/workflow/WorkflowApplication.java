package com.wellsky.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkflowApplication {

    public String PASSWORD = "SECRETPASSWORD";

    public static void main(String[] args) {
        //Bad variable name
        String SuperHorrible_VarName="";
        String bad="";
        //System out should be a critical
        System.out.println(SuperHorrible_VarName + bad);
        SpringApplication.run(WorkflowApplication.class, args);
    }
}
