package com.wellsky.workflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WorkflowApplication {

    public static void main(String[] args) {
        //Bad variable name
        String SuperHorrible="";
        //System out should be a critical
        System.out.println(SuperHorrible);
        SpringApplication.run(WorkflowApplication.class, args);
    }
}
