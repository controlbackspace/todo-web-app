package com.internship.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {
    public static void main(String[] args) {
        // This is the line that actually launches the Tomcat server on port 8080
        SpringApplication.run(TodoApplication.class, args);
    }
}