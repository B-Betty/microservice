package com.betty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.betty") //feign默认使用轮询算法

public class ConsumerDept_feign_Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept_feign_Application.class, args);
    }

}
