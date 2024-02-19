package com.hspedu.hspliving.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class HsplivingServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(HsplivingServiceApplication.class, args);
    }
}
