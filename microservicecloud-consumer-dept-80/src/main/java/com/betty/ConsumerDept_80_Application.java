package com.betty;

import com.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//在启动该微服务是就能去加载自定义的ribbon配置类，从而使配置生效
//MySelfRule.class 该类不能放在ComponentScan可扫描到的包中国
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MySelfRule.class)
public class ConsumerDept_80_Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDept_80_Application.class, args);
    }

}
