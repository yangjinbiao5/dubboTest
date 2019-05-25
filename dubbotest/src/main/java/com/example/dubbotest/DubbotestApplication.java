package com.example.dubbotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class DubbotestApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubbotestApplication.class, args);
    }

}
