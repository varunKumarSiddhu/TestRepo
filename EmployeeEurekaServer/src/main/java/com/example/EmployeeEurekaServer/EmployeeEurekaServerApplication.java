package com.example.EmployeeEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EmployeeEurekaServerApplication {
    public static void main(String[] args) {
    	// My first commnt
    	//My test branch1---with merging
    	SpringApplication.run(EmployeeEurekaServerApplication.class, args);
    }
}