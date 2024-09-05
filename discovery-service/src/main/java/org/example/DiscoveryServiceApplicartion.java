package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceApplicartion {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServiceApplicartion.class, args);
    }
}