package com.wellsky.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkflowApplication {

    private String Password = "not real still bad";

    public static void main(String[] args) {
        SpringApplication.run(WorkflowApplication.class, args);
        fakeMethod(null);
    }

    public static String fakeMethod(Integer param){
        return param.toString();
    }
}