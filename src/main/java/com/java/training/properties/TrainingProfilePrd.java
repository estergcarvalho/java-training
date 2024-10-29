package com.java.training.properties;

import com.java.training.TrainingApplication;
import org.springframework.boot.SpringApplication;

public class TrainingProfilePrd {
    public static void main(String[] args) {
        SpringApplication.run(TrainingApplication.class, args);

        System.out.println("Uploading application with production profile");
    }

}