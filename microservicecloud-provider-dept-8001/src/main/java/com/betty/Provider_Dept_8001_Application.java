package com.betty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient  //服务发现
public class Provider_Dept_8001_Application {

    public static void main(String[] args) {
        SpringApplication.run(Provider_Dept_8001_Application.class, args);
    }

}
