package com.achilles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan("com.achilles.controller")
public class MknApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MknApiApplication.class, args);
    }
}
