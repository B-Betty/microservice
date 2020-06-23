package com.betty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  //服务发现
@EnableCircuitBreaker //hystrix
public class Provider_Dept__hystrix_8001_Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider_Dept__hystrix_8001_Application.class, args);
    }

}
