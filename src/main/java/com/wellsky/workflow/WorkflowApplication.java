package com.wellsky.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkflowApplication {

    private String Password = "12345";

    public static void main(String[] args) {
        SpringApplication.run(WorkflowApplication.class, args);
    }
}
