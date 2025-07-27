package com.example.petapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.petapi.repository")
@EntityScan(basePackages = "com.example.petapi.entity")
public class PetapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PetapiApplication.class, args);
    }

}
