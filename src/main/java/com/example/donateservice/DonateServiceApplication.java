package com.example.donateservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DonateServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DonateServiceApplication.class, args);
    }

}
