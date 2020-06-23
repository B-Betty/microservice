package com.betty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerDept_hystrixDashboard_9001_Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept_hystrixDashboard_9001_Application.class, args);
    }

}
