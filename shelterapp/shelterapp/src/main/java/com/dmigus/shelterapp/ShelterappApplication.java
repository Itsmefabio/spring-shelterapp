package com.dmigus.shelterapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.dmigus.shelterapp"})
public class ShelterappApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShelterappApplication.class, args);

    }
}
